//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m02.q3;

import java.util.Scanner;
public class NumberLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upper Limit? ");
		int num = input.nextInt();
		input.close();
		int i = 0;
		while (Math.pow(i, 3) < num)
			i++;
		System.out.printf("Number is %d.\n", i - 1);
	}
}
