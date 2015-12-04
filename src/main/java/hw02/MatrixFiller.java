/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw02.q4;

import java.util.Scanner;
public class MatrixFiller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Size of Matrix: ");
		int matrixSize = input.nextInt();
		input.close();
		if (0 < matrixSize && matrixSize < 10)
			for (int i = 0; i < matrixSize; i++) {
				for (int j = 0; j < matrixSize; j++) {
					int num = (int) Math.floor(Math.random() * Math.pow(matrixSize, 2)) + 1;
					System.out.printf(" %02d", num);
				}
				System.out.println();
			}
	}
}
