/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q6;

import java.awt.geom.Point2D;
public class CircleMain {
	public static void main(String[] args) {
		Circle circle = new Circle(new Point2D.Double(1.0, 1.0), 4.0);
		circle.fill(new Color("blue"));
		circle.setBorder(new Border(0.1, new Color("red")));
		circle.resize(5);
		System.out.println(circle.getRadius());
		System.out.println(circle.getCenter());
		System.out.println(circle.getColor().getName());
	}
}
