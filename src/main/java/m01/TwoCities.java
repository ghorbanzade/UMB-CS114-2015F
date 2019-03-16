/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m01.q1.p3;

public class TwoCities {
	public static void main(String[] args) {
		if (args[0].compareTo(args[1]) < 0)
			System.out.println(args[0] + ", " + args[1]);
		else
			System.out.println(args[1] + ", " + args[0]);
	}
}
