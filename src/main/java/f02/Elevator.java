/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.f02.q5;

public class Elevator {
	private int floor;
	private final int limitUp = 10;
	private final int limitDown = -2;
	public Elevator() {
		this.floor = 0;
	}
	public void go(int level) {
		int dest = this.floor + level;
		if (dest <= limitUp && dest >= limitDown) {
			this.floor += level;
		}
		else {
			System.out.println("Impossible!");
		}
	}
	public void currentLevel() {
		System.out.println("Elevator is at floor " + this.floor);
	}
}
