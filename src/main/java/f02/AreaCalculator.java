/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q1.p2;

public class AreaCalculator {
	public static void main(String[] args) {
		int radius = Integer.parseInt(args[0]);
		double area = Math.PI * Math.pow(radius, 2);
		System.out.printf("%.2f\n", area);
	}
}
