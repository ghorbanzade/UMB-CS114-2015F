/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.f02.q2;

import java.util.Scanner;
public class Mystery {
	public static void main(String[] args) {
		int num = getNumber();
		int res = getResult(num);
		System.out.println(res);
	}
	public static int getNumber() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	public static int getResult(int num) {
		int result = 0;
		if (check(num)) {
			for (int i = 2; i < num; i++) {
				if (check(i)) {
					result++;
				}
			}
		}
		return result;
	}
	public static boolean check(int num) {
		boolean out = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				out = false;
				break;
			}
		}
		return out;
	}
}
