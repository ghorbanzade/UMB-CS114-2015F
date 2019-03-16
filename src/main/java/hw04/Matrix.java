/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q3;

public class Matrix {
	int[][] elements;
	public Matrix(int row, int col) {
		this.elements = new int[row][col];
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				int rand = (int) (Math.random() * row * col) + 1;
				this.elements[i][j] = rand;
			}
	}
	public void display() {
		int row = this.elements.length;
		int col = this.elements[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++)
				System.out.printf(" %02d", elements[i][j]);
			System.out.println();
		}
	}
}
