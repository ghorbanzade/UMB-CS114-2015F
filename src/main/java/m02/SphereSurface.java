//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m02.q1.p3;

public class SphereSurface {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		System.out.printf("%.2f\n", surface);
	}
}
