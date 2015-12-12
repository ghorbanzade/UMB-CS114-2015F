/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f01.q1.p4;

public class Random {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int random = getRandomNumber(num);
		System.out.println(random);
	}
	public static int getRandomNumber(int num) {
		return (int) (Math.random() * num);
	}
}
