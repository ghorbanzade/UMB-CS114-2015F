/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q4;

import java.util.Scanner;
public class Circles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		input.close();
		Circle myCircle = new Circle(radius);
		double area = myCircle.getArea();
		double perimeter = myCircle.getCircumference();
		System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
	}
}
