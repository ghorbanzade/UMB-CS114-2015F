/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.m01.q2;

public class NPrimes {
	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		int number = 1;
		for (int i = 0; i < count; i++) {
			while (true) {
				number++;
				boolean isPrime = true;
				for (int j = 2; j < number; j++) {
					if (number % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					break;
				}
			}
			System.out.println(number);
		}
	}
}
