/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q1.p5;

public class CarTest {
	public static void main(String[] args) {
		double distX = Double.parseDouble(args[0]);
		double distY = Double.parseDouble(args[1]);
		Car myCar = new Car();
		myCar.move(distX, distY);
		System.out.println(myCar.getDistance());
	}
}
