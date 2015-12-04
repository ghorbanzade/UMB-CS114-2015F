/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw03.q5;

import java.util.Scanner;
public class BackwardPrimes {
	public static void main(String[] args) {
		int i = 0;
		int num = 2;
		int count = getNum();
		while (i < count)
			if (checkNumber(num++) == true)
				i++;
		System.out.println();
	}
	public static int getNum() {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of Primes: ");
		int num = input.nextInt();
		input.close();
		return num;
	}
	public static boolean checkNumber(int number) {
		boolean flag = false;
		int reversed = reverse(number);
		if (number != reversed) {
			if (isPrime(number) && isPrime(reversed)) {
				System.out.printf("%d ", number);
				flag = true;
			}
		}
		return flag;
	}
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	public static int reverse(int number) {
		String str = Integer.toString(number);
		String strReversed = reverse(str);
		int numReversed = Integer.parseInt(strReversed);
		return numReversed;
	}
	public static String reverse(String str) {
		char[] strReversed = new char[str.length()];
		for (int i = 0; i < str.length(); i++)
			strReversed[i] = str.charAt(str.length() -i - 1);
		return new String(strReversed);
	}
}
