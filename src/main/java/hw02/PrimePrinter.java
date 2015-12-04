/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw02.q3;

import java.util.Scanner;
public class PrimePrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter Upper Limit: ");
		int limit = input.nextInt();
		input.close();
		for (int num = 2; num <= limit; num++) {
			boolean isPrime = true;
			for (int i = 2; i < num; i++)
				if (num % i == 0)
					isPrime = false;
			if (isPrime == true)
				System.out.printf("%d ", num);
		}
		System.out.println();
	}
}
