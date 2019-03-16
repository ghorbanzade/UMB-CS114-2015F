/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q1.p2;

public class Temperature {
	public static void main(String[] args) {
		double tempF = Double.parseDouble(args[0]);
		double tempC = 5 * (tempF - 32) / 9;
		System.out.printf("%.2f\n", tempC);
	}
}
