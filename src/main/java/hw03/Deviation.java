/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw03.q2;

import java.util.Scanner;
public class Deviation {
	public static void main(String[] args) {
		double[] numbers = getNumbers();
		double deviation = findDeviation(numbers);
		System.out.printf("Standard Deviation: %.3f\n", deviation);
	}
	public static double[] getNumbers() {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter count: ");
		int num = input.nextInt();
		double[] numbers = new double[num];
		System.out.printf("Enter %d Numbers: ", num);
		for (int i = 0; i < num; i++) {
			numbers[i] = input.nextDouble();
		}
		input.close();
		return numbers;
	}
	public static double findDeviation(double[] numbers) {
		double mean = findMean(numbers);
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += Math.pow(numbers[i] - mean, 2);
		double deviation = Math.sqrt(sum / (numbers.length - 1));
		return deviation;
	}
	public static double findMean(double[] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		double mean = sum / numbers.length;
		return mean;
	}
}
