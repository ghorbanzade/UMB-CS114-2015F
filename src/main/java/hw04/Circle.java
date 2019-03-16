/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q4;

public class Circle {
	double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = Math.PI * Math.pow(this.radius, 2);
		return area;
	}
	public double getCircumference() {
		double circumference = 2 * Math.PI * this.radius;
		return circumference;
	}
}
