/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m01.q1.p4;

public class ShowNum {
	public static void main(String[] args) {
		int limit = Integer.parseInt(args[0]);
		for (int i = 0; i < limit; i++) {
			System.out.printf("%d, ", i);
		}
	}
}
