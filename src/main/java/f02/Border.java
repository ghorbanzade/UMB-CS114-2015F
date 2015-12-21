/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
