//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m02.q2;

import java.util.Scanner;
public class FiveStar {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.printf("Insert Number: ");
		int num = key.nextInt();
		int rand = (int) (Math.random() * 100) + 1;
		double result = num * Math.pow(1, rand);
		double sum = 0;
		int var = 0;
		while (var != 6) {
			sum += Math.pow(-1, var) * result;
			var++;
		}
		System.out.printf("Result is %.2f\n", sum);
	}
}
