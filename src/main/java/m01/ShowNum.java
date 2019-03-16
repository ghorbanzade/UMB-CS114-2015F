/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m01.q1.p4;

public class ShowNum {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		for (int i = 0; i < limit; i++) {
			System.out.printf("%d, ", i);
		}
	}
}
