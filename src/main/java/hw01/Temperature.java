/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw01.q3;

public class Temperature {
	public static void main(String[] args) {
		double celsius = Double.parseDouble(args[0]);
		double fahrenheit = celsius * 1.8 + 32;
		System.out.println(celsius + " Celsius is " + fahrenheit + " fahrenheit.");
	}
}
