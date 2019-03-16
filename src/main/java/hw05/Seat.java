/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw05.q03;

/**
* This class defines a theater seat as an object that can be reserved.
*
* @author Pejman Ghorbanzade
* @see Theater
*/
public class Seat {
  /**
  * A theater seat may be reserved or not.
  */
  private boolean isReserved = false;

  /**
  * A theater seat is not initially reserved.
  */
  public Seat() {
  }

  /**
  * This method reserves the seat object.
  */
  public void reserve() {
    this.isReserved = true;
  }

  /**
  * This method checkes whether the seat object is reserved or not.
  */
  public boolean isReserved() {
    return this.isReserved;
  }
}
