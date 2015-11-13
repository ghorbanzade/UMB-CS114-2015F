//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.hw04.q1;

import java.util.Scanner;
public class MarkovMatrix {
	public static void main(String[] args) {
		double[][] matrix = initMatrix(3, 3);
		if (isMarkovMatrix(matrix))
			System.out.println("Markov matrix given.");
		else
			System.out.println("Matrix not Markov.");
	}
	public static double[][] initMatrix(int row, int col) {
		Scanner input = new Scanner(System.in);
		double[][] matrix = new double[row][col];
		for (int i = 0; i < row; i++) {
			System.out.printf("Enter Row %d: ", i + 1);
			for (int j = 0; j < col; j++)
				matrix[i][j] = input.nextDouble();
		}
		input.close();
		return matrix;
	}
	public static boolean isMarkovMatrix(double[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			double sum = 0;
			for (int j = 0; j < matrix.length; j++)
				sum += matrix[j][i];
			if (sum != 1)
				return false;
		}
		return true;
	}
}
