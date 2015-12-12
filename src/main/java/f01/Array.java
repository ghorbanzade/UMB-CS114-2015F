/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f01.q1.p3;

public class Array {
	public static void main(String[] args) {
		int sum = 0;
		int[] array = new int[5];
		for (int i = 1; i <= 5; i++) {
			array[i - 1] = i;
			sum += i;
		}
		System.out.println(sum);
	}
}
