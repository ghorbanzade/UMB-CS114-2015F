/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw04.q5;

import java.util.Scanner;
public class Kitten {
	public static void main(String[] args) {
		Cat myCat = new Cat("Kitty");
		double[] movement = promptMove(myCat);
		myCat.move(movement[0], movement[1]);
		myCat.showPosition();
		myCat.showDistance();
	}
	public static double[] promptMove(Cat myCat) {
		Scanner input = new Scanner(System.in);
		char[] directions = {'X', 'Y'};
		double[] movement = new double[directions.length];
		for (int i = 0; i < directions.length; i++) {
			System.out.printf("Distance to move in %c direction: ", directions[i]);
			movement[i] = input.nextDouble();
		}
		input.close();
		return movement;
	}
}
