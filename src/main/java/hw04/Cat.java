/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q5;

public class Cat {
	public String name;
	public double dirX = 0;
	public double dirY = 0;
	public Cat(String name) {
		this.name = name;
	}
	public void move(double dirX, double dirY) {
		this.dirX += dirX;
		this.dirY += dirY;
	}
	public void showPosition() {
		System.out.printf("%s is in (%.1f, %.1f).\n", this.name, this.dirX, this.dirY);
	}
	public void showDistance() {
		double distance = Math.sqrt(Math.pow(this.dirX, 2) + Math.pow(this.dirY, 2));
		System.out.printf("%s is %.2f units away from (0, 0).\n", this.name, distance);
	}
}
