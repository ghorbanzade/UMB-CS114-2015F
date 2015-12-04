/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw04.q4;

import java.util.Scanner;
public class Circles {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter radius: ");
		double radius = input.nextDouble();
		input.close();
		Circle myCircle = new Circle(radius);
		double area = myCircle.getArea();
		double perimeter = myCircle.getCircumference();
		System.out.printf("Area: %.2f, Perimeter: %.2f\n", area, perimeter);
	}
}
