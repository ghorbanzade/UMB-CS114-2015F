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
import java.util.Scanner;

/**
* This class provides the main method for the snake game application.
*
* @author Pejman Ghorbanzade
* @see Board
* @see Snake
* @see Food
*/
public class SnakeGame {
  /**
  * The game will end once the snake eats a total of five food sources.
  */
  private static final int MAX_SCORE = 5;
  public static int score = 0;

  /**
  * The main method for this application instantiates a snake and a food source
  * and allows user to control the snake toward the food source. The game
  * will end once the snake eats a total of five food sources.
  *
  * @param args command line arguments to be given to the program
  */
  public static void main(String[] args) {
    Snake snake = new Snake();
    Food food = new Food();
    while (score < MAX_SCORE) {
      if (snake.getLocation().equals(food.getLocation())) {
        food.relocate();
        score++;
      }
      System.out.printf("-------------------\n");
      System.out.printf("Points to Eat: %d\n", MAX_SCORE - score);
      Board.display(snake, food);
      System.out.printf("Enter command: ");
      Point movement = getCommand();
      if (movement.equals(new Point(0, 0))) {
        System.out.printf("Invalid command.\n");
      }
      snake.move(movement);
    }
  }

  /**
  * This method will prompt user for a command, parses the command and returns
  * the result as a point representing the distance the snake should move.
  *
  * @return a point representing the requested movements for the snake
  */
  public static Point getCommand() {
    Scanner input = new Scanner(System.in);
    String command = input.nextLine();
    return parseCommand(command);
  }

  /**
  * This method will parse the user command and returns the distance the snake
  * should move in form of a point instance.
  *
  * @param command string literal representing the user-specified command
  * @return a point representing the requested movements for the snake
  */
  public static Point parseCommand(String command) {
    Point movement = new Point(0, 0);
    int dist = (command.length() == 1) ? 1 : Character.getNumericValue(command.charAt(0));
    char direction = command.charAt(command.length()-1);
    switch (direction) {
      case 'a':
        movement.translate(-dist, 0);
        break;
      case 'd':
        movement.translate(dist, 0);
        break;
      case 'w':
        movement.translate(0, -dist);
        break;
      case 's':
        movement.translate(0, dist);
        break;
      default:
        break;
    }
    return movement;
  }

  /**
  * This class must not be instantiated.
  */
  private SnakeGame() {
  }
}
