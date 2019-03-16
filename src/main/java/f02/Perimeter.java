/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q1.p4;

public class Perimeter {
	public static void main(String[] args) {
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = Double.parseDouble(args[i]);
		}
		double perimeter = getPerimeter(sides);
		System.out.println(perimeter);
	}
	public static double getPerimeter(double[] sides) {
		double perimeter = 0;
		for (int i = 0; i < sides.length; i++) {
			perimeter += sides[i];
		}
		return perimeter;
	}
}
