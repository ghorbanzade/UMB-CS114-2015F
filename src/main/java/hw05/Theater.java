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
* This class defines a theater object as a container for the theater Seats.
*
* @author Pejman Ghorbanzade
* @see Seat
*/
public class Theater {
  /**
  * A theater has a number of rows that hold an array of Seat objects.
  */
  private int availableSeats;
  private Seat[][] seats;

  /**
  * Upon instantiation, a theater object has a number of Seats arranged in
  * a number of columns.
  *
  * @param rows number of rows in the theater
  * @param cols number of seats in each row
  */
  public Theater(int rows, int cols) {
    this.availableSeats = rows * cols;
    this.seats = new Seat[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        this.seats[i][j] = new Seat();
      }
    }
  }

  /**
  * This method tries to reserve the given number of seats following the
  * rules given in the problem definition. If it was not possible to reserve
  * a requested number of rows, the method would return -1.
  *
  * @param the number of seats to be reserved
  * @return the index of the first seat which was reserved
  */
  public int reserve(int num) {
    for (int row = 0; row < this.seats.length; row++) {
      int index = getFirstAvailableSeatInRow(this.seats[row]);
      if (index + num <= this.seats[row].length) {
        for (int j = 0; j < num; j++) {
          this.seats[row][index + j].reserve();
          this.availableSeats--;
        }
        return row * this.seats[0].length + index;
      }
    }
    return -1;
  }

  /**
  * This method finds the index of the seat in the given row of seats
  * which is not reserved yet. The index starts with 0.
  *
  * @param row the row of seats to be looked into
  * @return index of the first seat in a row which is not reserved yet
  */
  private int getFirstAvailableSeatInRow(Seat[] row) {
    int i;
    for (i = 0; i < row.length; i++) {
      if (!row[i].isReserved()) {
        break;
      }
    }
    return i;
  }

  /**
  * This method returns number of remaining seats to be reserved.
  *
  * @return number of available seats in the theater
  */
  public int getNumTotalAvailableSeats() {
    return this.availableSeats;
  }

  /**
  * This method simply returns number of rows in the theater.
  *
  * @return number of rows in theater
  */
  public int getNumRows() {
    return this.seats.length;
  }

  /**
  * This method simply returns number of seats in each row.
  *
  * @return number of seats in each row
  */
  public int getNumSeatsInRow() {
    return this.seats[0].length;
  }

}
