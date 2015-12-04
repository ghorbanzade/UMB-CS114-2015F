/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m01.q2;

public class NPrimes {
	public static void main(String[] args) {
		int count = Integer.parseInt(args[0]);
		int number = 1;
		for (int i = 0; i < count; i++) {
			while (true) {
				number++;
				boolean isPrime = true;
				for (int j = 2; j < number; j++) {
					if (number % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					break;
				}
			}
			System.out.println(number);
		}
	}
}
