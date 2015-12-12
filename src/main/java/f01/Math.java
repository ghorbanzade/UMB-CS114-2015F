/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f01.q2;

public class Math {
	public static void main(String[] args) {
		int sum = 0;
		int num = Integer.parseInt(args[0]);
		for (int i = 1; i <= num; i++) {
			int tmp = i;
			for (int j = 1; j < i; j++) {
				tmp *= i;
			}
			sum += tmp;
		}
		System.out.println(sum);
	}
}
