package day4;

import java.util.Scanner;

/**
 * 
 * given a number print all the primes with in that range.
 * 
 * @author durga prasad
 *
 */
public class PrimeGenerator {

	public static boolean isPrime(int n) {
		if (n == 1 || n == 0)
			return false;
		boolean isPrime = true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static void printPrimes(int n) {
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	// https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
	public static void sieveofEratosthenes(int n) {
		boolean[] primes = new boolean[n + 1];

		for (int i = 2; i * i < primes.length; i++) {
			if (!primes[i]) {
				for (int j = i; i * j < primes.length; j++) {
					primes[i * j] = true;
				}
			}
		}

		for (int i = 2; i < primes.length; i++) {
			if (!primes[i]) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		printPrimes(n);

		System.out.println(".......");

		sieveofEratosthenes(n);

	}
}
