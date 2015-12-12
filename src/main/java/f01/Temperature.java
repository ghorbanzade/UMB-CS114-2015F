/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f01.q1.p2;

public class Temperature {
	public static void main(String[] args) {
		double tempF = Double.parseDouble(args[0]);
		double tempC = 5 * (tempF - 32) / 9;
		System.out.printf("%.2f\n", tempC);
	}
}
