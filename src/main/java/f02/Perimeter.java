/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q1.p4;

public class Perimeter {
	public static void main(String[] args) {
		double[] sides = new double[3];
		for (int i = 0; i < sides.length; i++) {
			sides[i] = Double.parseDouble(args[i]);
		}
		double perimeter = getPerimeter(sides);
		System.out.println(perimeter);
	}
	public static double getPerimeter(double[] sides) {
		double perimeter = 0;
		for (int i = 0; i < sides.length; i++) {
			perimeter += sides[i];
		}
		return perimeter;
	}
}
