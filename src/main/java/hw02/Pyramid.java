/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw02.q5;

import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Number of Rows: ");
		int numRows = input.nextInt();
		input.close();
		for (int i = 0; i < numRows; i++) {
			int numElements = i;
			int numIndents = numRows - i - 1;
			for (int j = 0; j < numIndents; j++)
				System.out.printf("    ");
			for (int j = 0; j < i; j++)
				System.out.printf("%4.0f", Math.pow(2, j));
			for (int j = i; j >= 0; j--)
				System.out.printf("%4.0f", Math.pow(2, j));
			System.out.println();
		}
	}
}
