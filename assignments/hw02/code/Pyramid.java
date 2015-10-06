//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Scanner;
public class Pyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Number of Rows: ");
		int numRows = input.nextInt();
		input.close();
		for (int i = 0; i < numRows; i++) {
			int numElements = i;
			int numIndents = numRows - i - 1;
			for (int j = 0; j < numIndents; j++)
				System.out.printf("    ");
			for (int j = 0; j < i; j++)
				System.out.printf("%4.0f", Math.pow(2, j));
			for (int j = i; j >= 0; j--)
				System.out.printf("%4.0f", Math.pow(2, j));
			System.out.println();
		}
	}
}
