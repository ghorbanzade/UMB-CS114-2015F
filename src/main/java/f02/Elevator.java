/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
