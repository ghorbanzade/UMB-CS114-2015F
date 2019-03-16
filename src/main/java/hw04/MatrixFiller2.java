/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
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
