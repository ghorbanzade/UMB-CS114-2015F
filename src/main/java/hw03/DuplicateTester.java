/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw03.q3;

import java.util.Scanner;
public class DuplicateTester {
	public static void main(String[] args) {
		int size = getSize();
		System.out.println("Generated Array:");
		int[] array = generateArray(size);
		display(array);
		System.out.println("Filtered Array:");
		int[] newArray = removeDuplicates(array);
		display(newArray);
	}
	public static int getSize() {
		Scanner input = new Scanner(System.in);
		System.out.print("Size of Array: ");
		int size = input.nextInt();
		input.close();
		return size;
	}
	public static int[] generateArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = (int) Math.floor(Math.random() * 10);
		return array;
	}
	public static int[] removeDuplicates(int[] array) {
		boolean[] flags = new boolean[10];
		int[] numbers = new int[10];
		for (int i = 0; i < flags.length; i++)
			flags[i] = false;
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			if (flags[array[i]] == false) {
				flags[array[i]] = true;
				numbers[j++] = array[i];
			}
		}
		int[] newArray = new int[j];
		for (int i = 0; i < j; i++)
			newArray[i] = numbers[i];
		return newArray;
	}
	public static void display(int[] array) {
		int size = array.length;
		for (int i = 0; i < size; i++)
			System.out.printf("%d ", array[i]);
		System.out.println();
	}
}
