/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw05.q03;

import java.util.Scanner;

/**
* This main class tests the design by creating a theater and selling its
* tickets.
*
* @author Pejman Ghorbanzade
*/
public class BoxOffice {
  /**
  * The main method of this application creates a theater with 5 rows and
  * 10 seats in each row and sells ticket to the user according to the rules
  * specified in the problem. The program terminates once all the seats are
  * sold out.
  *
  * @param args command line arguments to be given to the program
  */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Theater theater = new Theater(5, 10);
    while (theater.getNumTotalAvailableSeats() > 0) {
      System.out.printf("%d seats still available.\n", theater.getNumTotalAvailableSeats());
      System.out.printf("Number of tickets to print? ");
      int num = input.nextShort();
      int index = theater.reserve(num);
      if (index == -1) {
        System.out.printf("Tickets not available for group of %d\n\n", num);
      } else {
        System.out.printf("Sold seats %d-%d of row %d\n\n",
                          index % theater.getNumSeatsInRow() + 1,
                          index % theater.getNumSeatsInRow() + num,
                          index / theater.getNumSeatsInRow() + 1);
      }
    }
  }

  /**
  * This class must not be instantiated.
  */
  private BoxOffice() {
  }
}
