/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m02.q1.p2;

public class Feet2Centimeters {
	public static void main(String[] args) {
		double conversion = 30.48;
		double cm = Double.parseDouble(args[0]) * conversion;
		System.out.println(cm);
	}
}
