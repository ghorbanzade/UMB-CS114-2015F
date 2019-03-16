/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m01.q3;

import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String phrase = input.nextLine();
		int limit = (int) (phrase.length() / 2);
		boolean isPalindrome = true;
		for (int i = 0; i < limit; i++) {
			if (phrase.charAt(i) != phrase.charAt(phrase.length() - i - 1)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome)
			System.out.println("Your String is a Palindrome.");
		else
			System.out.println("Your String is not a Palindrome.");
	}
}
