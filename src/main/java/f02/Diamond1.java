/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q3;

import java.util.Scanner;
public class Diamond1 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Number of rows: ");
		int numRows = input.nextInt();
		input.close();
		for (int i = 1 ; i <= numRows; i++) {
			for (int j = numRows; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
