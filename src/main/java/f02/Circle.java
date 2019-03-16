/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q6;

import java.awt.geom.Point2D;
public class Circle {
	private Color color;
	private Border border;
	private double radius;
	private Point2D center = new Point2D.Double();
	public Circle(Point2D center, double radius) {
		this.center.setLocation(center);
		this.radius = radius;
	}
	public Color getColor() {
		return this.color;
	}
	public Border getBorder() {
		return this.border;
	}
	public double getRadius() {
		return this.radius;
	}
	public Point2D getCenter() {
		return this.center;
	}
	public void fill(Color color) {
		this.color = color;
	}
	public void setBorder(Border border) {
		this.border = border;
	}
	public void resize(double radius) {
		this.radius = radius;
	}
	public void transform(Point2D center) {
		this.center = center;
	}
}
