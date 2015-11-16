//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
