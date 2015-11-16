//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

package edu.umb.cs114.hw04.q2;

public class Point {
	public double[] coordinates;
	public Point(double[] coordinates) {
		this.coordinates = coordinates;
	}
	public double getDistance(Point point) {
		double sum = 0;
		for (int i = 0; i < 3; i++)
			sum += Math.pow(this.coordinates[i] - point.coordinates[i], 2);
		return Math.sqrt(sum);
	}
}
