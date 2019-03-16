/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q2;

import java.util.Scanner;
public class PointAndSphere2 {
	public static void main(String[] args) {
		double[] pointCoordinates = promptCoordinates("Point");
		double[] sphereCoordinates = promptCoordinates("Sphere");
		double radius = promptRadius();
		Point point = new Point(pointCoordinates);
		Point center = new Point(sphereCoordinates);
		Sphere sphere = new Sphere(center, radius);
		double dist = sphere.center.getDistance(point);
		if (dist > sphere.radius)
			System.out.println("The point is outside the sphere.");
		else if (dist == sphere.radius)
			System.out.println("The point is on the sphere.");
		else
			System.out.println("The point is inside the sphere.");
	}
	public static double[] promptCoordinates(String name) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Coordinates of %s: ", name);
		double[] coordinates = new double[3];
		for (int i = 0; i < coordinates.length; i++)
			coordinates[i] = input.nextDouble();
		return coordinates;
	}
	public static double promptRadius() {
		Scanner input = new Scanner(System.in);
		System.out.print("Radius of Sphere: ");
		double radius = input.nextDouble();
		return radius;
	}
}
