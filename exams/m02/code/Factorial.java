//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m02.q1.p4;

public class Factorial {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int counter = 1;
		int result = 1;
		do {
			result *= counter;
			counter++;
		}
		while (counter <= num);
		System.out.println(result);
	}
}
