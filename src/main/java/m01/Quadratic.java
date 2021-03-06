/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m01.q1.p2;

public class Quadratic {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		double discriminant = b*b - 4*a*c;
		if (discriminant > 0) {
			double sol1 = (- b - Math.sqrt(discriminant))/(2*a);
			double sol2 = (- b + Math.sqrt(discriminant))/(2*a);
			System.out.printf("%.3f and %.3f\n", sol1, sol2);
		}
	}
}
