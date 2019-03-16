/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f01.q1.p4;

public class Random {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int random = getRandomNumber(num);
		System.out.println(random);
	}
	public static int getRandomNumber(int num) {
		return (int) (Math.random() * num);
	}
}
