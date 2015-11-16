//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m02.q1.p2;

public class Feet2Centimeters {
	public static void main(String[] args) {
		double conversion = 30.48;
		double cm = Double.parseDouble(args[0]) * conversion;
		System.out.println(cm);
	}
}
