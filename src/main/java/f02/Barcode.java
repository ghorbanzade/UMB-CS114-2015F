/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q4;

import java.util.Scanner;
public class Barcode {
	public static void main(String[] args) {
		System.out.print("Number of rows: ");
		int rows = getInput();
		System.out.print("Number of columns: ");
		int cols = getInput();
		char[][] code = generateBarcode(rows, cols);
		displayBarcode(code);
	}
	public static int getInput() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static char[][] generateBarcode(int rows, int cols) {
		char[][] code = new char[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				code[i][j] = (Math.round(Math.random()) == 0)
					? '*' : ' ';
			}
		}
		return code;
	}
	public static void displayBarcode(char[][] code) {
		for (int i = 0; i < code.length; i++) {
			System.out.println(new String(code[i]));
		}
	}
}
