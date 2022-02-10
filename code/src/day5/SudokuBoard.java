package day5;


/**
 * solve sudoku board 9 * 9 size
 * 
 * @author durga prasad
 *
 */
public class SudokuBoard {
	
	private static final int BOARD_SIZE = 9;
	
	// check if the passed number is already present in the row
	private static boolean isNumberValidForRow(int[][] board, int row, int number) {
		for(int col = 0; col < BOARD_SIZE; col++) {
			if(board[row][col] == number) {
				return false;
			}
		}
		return true;
	}
	
	// check if the passed number is already present in the column
	private static boolean isNumberValidForCol(int[][] board, int col, int number) {
		for(int row = 0; row < BOARD_SIZE; row++) {
			if(board[row][col] == number) {
				return false;
			}
		}
		return true;
	}
	
	// check if the passed number is already present in the sub matrix (3 * 3)
	private static boolean isNumberValidForLocalBox(int[][] board, int row, int col,  int number) {
		int boxRow = row - (row % 3);   
		int boxCol = col - (col % 3);
		 //top left cell of sub matrix (boxRow, boxCol)
		for(int i = boxRow; i < boxRow + 3; i++) {
			for(int j = boxCol; j < boxCol + 3; j++) {
				if(board[i][j] == number) {
					return false;
				}
			}
		}
		return true;
	}
	
	// check if the number is already present in the associated 3 * 3 submatrix
	private static boolean isNumberValidForCell(int[][] board, int row, int col, int number) {
		
		return (isNumberValidForRow(board, row, number) && isNumberValidForCol(board, col, number) 
				&& isNumberValidForLocalBox(board, row, col, number));
	}
	
	private static boolean solveSudoku(int[][] board) {
		for(int row = 0; row < BOARD_SIZE; row++) {
			for(int col = 0; col < BOARD_SIZE; col++) {
			if(board[row][col] == 0) {	
				for(int number = 1; number <=9; number++) {
					if(isNumberValidForCell(board, row, col, number)) {
						board[row][col] = number;
						if(solveSudoku(board)) { // recursion
							return true;
						}else {
							board[row][col] = 0; //backtracking
						}
					}
				}
				return false;
			}
				
			}
		}
		
		return true;
	}
	
	private static void printBoard(int[][] board) {
	    for (int row = 0; row < BOARD_SIZE; row++) {
	      if (row % 3 == 0 && row != 0) {
	        System.out.println("-----------");
	      }
	      for (int column = 0; column < BOARD_SIZE; column++) {
	        if (column % 3 == 0 && column != 0) {
	          System.out.print("|");
	        }
	        System.out.print(board[row][column]);
	      }
	      System.out.println();
	    }
	  }
	
	
	public static void main(String[] args) {
		
		int[][] board = {
		        {7, 0, 2, 0, 5, 0, 6, 0, 0},
		        {0, 0, 0, 0, 0, 3, 0, 0, 0},
		        {1, 0, 0, 0, 0, 9, 5, 0, 0},
		        {8, 0, 0, 0, 0, 0, 0, 9, 0},
		        {0, 4, 3, 0, 0, 0, 7, 5, 0},
		        {0, 9, 0, 0, 0, 0, 0, 0, 8},
		        {0, 0, 9, 7, 0, 0, 0, 0, 5},
		        {0, 0, 0, 2, 0, 0, 0, 0, 0},
		        {0, 0, 7, 0, 4, 0, 2, 0, 3} 
		      };
		    
		    printBoard(board);
		    
		    if (solveSudoku(board)) {
		      System.out.println("Solved successfully!");
		    }
		    else {
		      System.out.println("Unsolvable board :(");
		    }
		    
		    printBoard(board);
	}

}
