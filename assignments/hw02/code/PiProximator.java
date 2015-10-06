//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

import java.util.Scanner;
public class PiProximator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Number of Sentences: ");
		int num = input.nextInt();
		input.close();
		double sum = 0;
		for (int i = 1; i <= num; i ++)
			sum += Math.pow(-1, i + 1) / (2 * i - 1);
		double pi = 4 * sum;
		System.out.printf("Approximate Value: %.6f\n", pi);
		System.out.printf("Approximation Error: %.6f\n", Math.abs(Math.PI - pi));
	}
}
