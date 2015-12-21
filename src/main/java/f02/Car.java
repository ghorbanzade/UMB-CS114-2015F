/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q1.p5;

public class Car {
	private double posX;
	private double posY;
	public Car() {
		this.posX = 0;
		this.posY = 0;
	}
	public void move(double distX, double distY) {
		this.posX += distX;
		this.posY += distY;
	}
	public double getDistance() {
		double a = Math.pow(this.posX, 2);
		double b = Math.pow(this.posY, 2);
		return Math.sqrt(a + b);
	}
}
