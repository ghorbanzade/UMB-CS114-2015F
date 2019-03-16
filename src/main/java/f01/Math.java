/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q2;

public class Math {
	public static void main(String[] args) {
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		for (int i = 1; i <= num; i++) {
			int tmp = i;
			for (int j = 1; j < i; j++) {
				tmp *= i;
			}
			sum += tmp;
		}
		System.out.println(sum);
	}
}
