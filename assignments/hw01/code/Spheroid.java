//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.hw01.q5;

public class Spheroid {
	public static void main(String[] args) {
		double a = Double.parseDouble(args[0]);
		double c = Double.parseDouble(args[1]);
		double e = Math.sqrt(1 - Math.pow(c, 2)/Math.pow(a, 2));
		double surface = 2 * Math.PI * Math.pow(a, 2) + Math.PI * Math.pow(c, 2) / e * Math.log( (1+e) / (1-e));
		System.out.printf("Surface area is %.3f\n", surface);
	}
}
