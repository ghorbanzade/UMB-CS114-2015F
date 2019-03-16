/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw01.q3;

public class Temperature {
	public static void main(String[] args) {
		double celsius = Double.parseDouble(args[0]);
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit.");
	}
}
