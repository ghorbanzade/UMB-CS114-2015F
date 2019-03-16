/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw02.q3;

import java.util.Scanner;
public class PrimePrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Upper Limit: ");
		int limit = input.nextInt();
		input.close();
		for (int num = 2; num <= limit; num++) {
			boolean isPrime = true;
			for (int i = 2; i < num; i++)
				if (num % i == 0)
					isPrime = false;
			if (isPrime == true)
				System.out.printf("%d ", num);
		}
		System.out.println();
	}
}
