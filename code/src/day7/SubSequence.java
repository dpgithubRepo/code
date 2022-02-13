package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * given a string, print the subsequences of that string
 * 
 * example : abc = >  [, c, b, bc, a, ac, ab, abc]
 * 
 * @author durga prasad 
 *
 */
public class SubSequence {

	public static List<String> getSubsequence(String str) {

		
		//base case
		if (str.length() == 0) {
			List<String> baseList = new ArrayList<>();
			baseList.add("");
			return baseList;
		}

		char first = str.charAt(0);
		String remainingString = str.substring(1);
		
		List<String> rStringResult = getSubsequence(remainingString);
		
		List<String> resultList = new ArrayList<>();
		
		for (String s : rStringResult) {
			resultList.add(s);
		}
		
		
		for (String s : rStringResult) {
			resultList.add(first + s);
		}
		return resultList;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		scanner.close();
		System.out.println(getSubsequence(str));
	}
}
