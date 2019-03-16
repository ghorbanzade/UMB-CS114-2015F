/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m02.q1.p3;

public class SphereSurface {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		System.out.printf("%.2f\n", surface);
	}
}
