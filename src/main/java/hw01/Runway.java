/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw01.q4;

public class Runway {
	public static void main(String[] args) {
		double speed = Double.parseDouble(args[0]);
		double acceleration = Double.parseDouble(args[1]);
		double runwayLength = Math.pow(speed, 2) / (2 * acceleration);
		System.out.printf("Speed of the airplane is assumed %.3f m/s\n", speed);
		System.out.printf("Acceleration of the airplane is assumed %.3f m/s2\n", acceleration);
		System.out.printf("Minimum runway length is %.3f m\n", runwayLength);
	}
}
