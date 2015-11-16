//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.m01.q1.p4;

public class ShowNum {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		for (int i = 0; i < limit; i++) {
			System.out.printf("%d, ", i);
		}
	}
}
