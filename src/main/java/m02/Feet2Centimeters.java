/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m02.q1.p2;

public class Feet2Centimeters {
	public static void main(String[] args) {
		double conversion = 30.48;
		double cm = Double.parseDouble(args[0]) * conversion;
		System.out.println(cm);
	}
}
