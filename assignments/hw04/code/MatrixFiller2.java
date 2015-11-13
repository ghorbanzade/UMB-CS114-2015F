//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
