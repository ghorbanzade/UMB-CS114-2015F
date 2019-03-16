/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
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
