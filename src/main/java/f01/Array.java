/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q1.p3;

public class Array {
	public static void main(String[] args) {
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		int[] array = new int[num];
		for (int i = 1; i <= num; i++) {
			array[i - 1] = i;
			sum += i;
		}
		System.out.println(sum);
	}
}
