/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q6;

public class Border {
	private double width;
	private Color color;
	public Border(double width, Color color) {
		this.width = width;
		this.color = color;
	}
	public double getWidth() {
		return this.width;
	}
	public Color getColor() {
		return this.color;
	}
	public void resize(double width) {
		this.width = width;
	}
	public void repaint(Color color) {
		this.color = color;
	}
}
