/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.m02.q3;

import java.util.Scanner;
public class NumberLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Upper Limit? ");
		int num = input.nextInt();
		input.close();
		int i = 0;
		while (Math.pow(i, 3) < num)
			i++;
		System.out.printf("Number is %d.\n", i - 1);
	}
}
