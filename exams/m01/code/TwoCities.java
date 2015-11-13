//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m01.q1.p3;

public class TwoCities {
	public static void main(String[] args) {
		if (args[0].compareTo(args[1]) < 0)
			System.out.println(args[0] + ", " + args[1]);
		else
			System.out.println(args[1] + ", " + args[0]);
	}
}
