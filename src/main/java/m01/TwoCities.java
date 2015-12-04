/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m01.q1.p3;

public class TwoCities {
	public static void main(String[] args) {
		if (args[0].compareTo(args[1]) < 0)
			System.out.println(args[0] + ", " + args[1]);
		else
			System.out.println(args[1] + ", " + args[0]);
	}
}
