/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw05.q04;

import java.awt.Point;

/**
* This class represents the snake of our snake game.
*
* @author Pejman Ghorbanzade
* @see Board
*/
public class Snake {
  /**
  * The board has one single snake that occupies a single cell.
  */
  private Point pos;

  /**
  * The constructor for this class will randomly generate coordinates
  * for a snake instance.
  */
  public Snake() {
    this.pos = new Point(Board.randomLocation());
  }

  /**
  * This method will move the snake moveX and moveY units in x and y
  * direction, provided that the new position is still on the board.
  * In case it is not, the method will gracefully terminate without moving
  * the snake object.
  *
  * @param movement a point representing the distance to move in x and y
  *                 directions.
  */
  public void move(Point movement) {
    Point newPos = new Point(this.pos);
    newPos.translate((int) movement.getX(), (int) movement.getY());
    if (newPos.getX() < Board.COLS &&
        newPos.getX() >= 0 &&
        newPos.getY() < Board.ROWS &&
        newPos.getY() >= 0) {
      this.pos.setLocation(newPos);
    } else {
      System.out.printf("Invalid command.\n");
    }
  }

  /**
  * This accessor method returns the coordinates at which the snake is
  * located.
  *
  * @return the coordinates at which the snake is located
  */
  public Point getLocation() {
    return this.pos.getLocation();
  }
}
