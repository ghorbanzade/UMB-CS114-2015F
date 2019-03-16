/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

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
