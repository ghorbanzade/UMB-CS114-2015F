//
//	Copyright (c) 2015
//	Pejman Ghorbanzade <mail@ghorbanzade.com>
//	CS114: Introduction to Java
//	Department of Computer Science
//	University of Massachusetts Boston
//

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
