/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q3;

import java.util.Scanner;
public class Diamond2 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int numRows = input.nextInt();
		input.close();
		for (int i = 1 ; i <= 2 * numRows - 1; i++) {
			if (i <= numRows) {
				for (int j = numRows; j > i; j--) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2*i-1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int j = 0; j < i-numRows; j++) {
					System.out.print(" ");
				}
				for (int j = 0; j < 2*(2*numRows-i)-1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
