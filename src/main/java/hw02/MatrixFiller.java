//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
