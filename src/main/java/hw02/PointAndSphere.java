/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw02.q1;

import java.util.Scanner;
public class PointAndSphere {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pointX = Double.parseDouble(args[0]);
		double pointY = Double.parseDouble(args[1]);
		double pointZ = Double.parseDouble(args[2]);
		double sphereX = Double.parseDouble(args[3]);
		double sphereY = Double.parseDouble(args[4]);
		double sphereZ = Double.parseDouble(args[5]);
		System.out.printf("Radius of the Sphere: ");
		double radius = input.nextDouble();
		input.close();
		double distance = Math.sqrt(Math.pow(sphereZ - pointZ, 2) + Math.pow(sphereY - pointY, 2) + Math.pow(sphereX - pointX, 2));
		if (distance < radius)
			System.out.println("The point is inside the sphere.");
		else if (distance == radius)
			System.out.println("THe point is on the sphere.");
		else
			System.out.println("The point is outside the sphere.");
	}
}
