/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
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
