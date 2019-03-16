/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q1.p5;

public class CarTest {
	public static void main(String[] args) {
		double distX = Double.parseDouble(args[0]);
		double distY = Double.parseDouble(args[1]);
		Car myCar = new Car();
		myCar.move(distX, distY);
		System.out.println(myCar.getDistance());
	}
}
