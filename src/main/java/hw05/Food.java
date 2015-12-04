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
* This class represents the food source of our snake game.
*
* @author Pejman Ghorbanzade
* @see Board
*/
public class Food {
  /**
  * The board has one single food source that occupies a single cell.
  */
  private Point pos;

  /**
  * The constructor for this class will randomly a food source whose
  * coordinates are randomly generated.
  *
  * <p>There is no guarantee that the randomly generated position is not
  * the location of the snake.
  */
  public Food() {
    this.pos = new Point(Board.randomLocation());
  }

  /**
  * This method will randomly generate new coordinates for the food source.
  */
  public void relocate() {
    this.pos.setLocation(Board.randomLocation());
  }

  /**
  * This accessor method returns the coordinates at which the food is located.
  *
  * @return the coordinates at which the food is located
  */
  public Point getLocation() {
    return this.pos.getLocation();
  }

}
