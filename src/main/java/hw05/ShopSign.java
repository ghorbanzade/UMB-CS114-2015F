/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw05.q02;

import java.util.Scanner;

/**
* This class provides the main method of the problem.
*
* @author Pejman Ghorbanzade
*/
public class ShopSign {
  /**
  * The main method of this program will prompt user for a sequence of
  * available characters and the proposed message.
  * The method would then check if the proposed message can be constructed
  * using the available characters.
  *
  * @param args the command line arguments to be given to the program
  */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Enter available characters: ");
    String characters = input.nextLine();
    CharacterBox box = new CharacterBox(characters);
    System.out.printf("Enter proposed message: ");
    String message = input.nextLine();
    char result = box.check(message);
    if (result == '#') {
      System.out.printf("The message makes it to the sign board.\n");
    } else {
      System.out.printf("We are short of character %c.\n", result);
    }
  }

  /**
  * This class must not be instantiated
  */
  private ShopSign() {
  }
}
