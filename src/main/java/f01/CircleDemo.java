/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q1.p5;

public class CircleDemo {
	public static void main(String[] args) {
		Circle circle = new Circle(Double.parseDouble(args[0]));
		System.out.printf("%.2f\n", circle.getArea());
	}
}
