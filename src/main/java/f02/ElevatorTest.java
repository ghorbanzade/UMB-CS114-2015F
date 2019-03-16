/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q5;

public class ElevatorTest {
	public static void main(String[] args) {
		Elevator elevator = new Elevator();
		elevator.currentLevel(); //outputs current floor
		elevator.go(2); //moves the elevator two floors up
		elevator.currentLevel();
	}
}
