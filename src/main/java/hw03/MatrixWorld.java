/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw03.q4;

import java.util.Scanner;
public class MatrixWorld {
	public static void main(String[] args) {
		int size = getSize();
		int[][] matrixA = matrixInit(size);
		int[][] matrixB = matrixInit(size);
		int[][] sum = matrixAdd(matrixA, matrixB);
		int[][] multiplication = matrixMultiply(matrixA, matrixB);
		matrixDisplay(matrixA, "Matrix A");
		matrixDisplay(matrixB, "Matrix B");
		matrixDisplay(sum, "Sum");
		matrixDisplay(multiplication, "Multiplication");
	}
	public static int getSize() {
		Scanner input = new Scanner(System.in);
		System.out.print("Size of Matrices: ");
		int size = input.nextInt();
		input.close();
		return size;
	}
	public static int[][] matrixInit(int size) {
		int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				matrix[i][j] = (int) Math.floor(Math.random() * 10);
		return matrix;
	}
	public static int[][] matrixAdd(int[][] matrixA, int[][] matrixB) {
		int size = matrixA.length;
		int[][] sum = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				sum[i][j] = matrixA[i][j] + matrixB[i][j];
		return sum;
	}
	public static int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) {
		int size = matrixA.length;
		int[][] multiplication = new int[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				multiplication[i][j] = 0;
				for (int k = 0; k < size; k++) {
					multiplication[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		return multiplication;
	}
	public static void matrixDisplay(int[][] matrix, String name) {
		int size = matrix.length;
		System.out.printf("\n%s:\n", name);
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++)
				System.out.printf("%3d ", matrix[i][j]);
			System.out.println();
		}
	}
}
