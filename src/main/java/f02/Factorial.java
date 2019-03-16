/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q1.p3;

public class Factorial {
	public static void main(String[] args) {
                int num = Integer.parseInt(args[0]);
                int sum = 1;
                for (int i = 1; i <= num; i++) {
                  sum *= i;
                }
		System.out.println(sum);
	}
}
