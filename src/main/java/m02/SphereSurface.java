/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m02.q1.p3;

public class SphereSurface {
	public static void main(String[] args) {
		double radius = Double.parseDouble(args[0]);
		double surface = 4 * Math.PI * Math.pow(radius, 2);
		System.out.printf("%.2f\n", surface);
	}
}
