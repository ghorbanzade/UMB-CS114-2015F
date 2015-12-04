/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw05.q04;

import java.awt.Point;

/**
* This singleton utility class will represent the board on which snake
* can move toward the food source.
*
* @author Pejman Ghorbanzade
* @see Snake
* @see Food
*/
public class Board {
  /**
  * The board has a fixed number of rows and a number of columns.
  */
  public static final int ROWS = 5;
  public static final int COLS = 10;

  /**
  * This static method will display positions of the snake and the food source.
  *
  * @param snake the snake that moves toward the food source
  * @param food the food source to be eaten by snake
  */
  public static void display(Snake snake, Food food) {
    Point cell = new Point();
    for (int i = 0; i < ROWS; i++) {
      for (int j = 0; j < COLS; j++) {
        cell.setLocation(j, i);
        if (cell.equals(snake.getLocation())) {
          System.out.print("|");
        }
        if (cell.equals(food.getLocation())) {
          System.out.print("o");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  /**
  * This static method will randomly selects one of the cells on the board.
  *
  * @return a randomly generated coordinate to be used for objects on the
  *         board.
  */
  public static Point randomLocation() {
    int posX = (int) (Math.random() * Board.COLS);
    int posY = (int) (Math.random() * Board.ROWS);
    return new Point(posX, posY);
  }

  /**
  * This class must not be instantiated.
  */
  private Board() {
  }
}
