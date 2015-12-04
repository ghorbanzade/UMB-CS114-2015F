/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw04.q3;

import java.util.Scanner;
public class MatrixFiller2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Size of Matrix: ");
		int size = input.nextInt();
		input.close();
		Matrix matrix = new Matrix(size, size);
		matrix.display();
	}
}
