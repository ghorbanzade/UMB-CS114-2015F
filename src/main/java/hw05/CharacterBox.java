/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw05.q02;

/**
* This class defines a container for the magnetic characters. It provides an
* abstraction layer for developing the processing logic of the program.
*
* @author Pejman Ghorbanzade
* @see MagneticCharacter
*/
public class CharacterBox {
  /**
  * A CharacterBox object is nothing more than a container of
  * MagneticCharacter objects.
  */
  private MagneticCharacter[] characters;

  /**
  * The constructor takes the string the user has provided, removes the
  * whitespace out of it and fills the container with MagneticCharacter objects
  * that represent the characters in the string.
  *
  * @param str the string literal given by the user
  */
  public CharacterBox(String str) {
    String content = str.replaceAll("\\s+", "");
    this.characters = new MagneticCharacter[content.length()];
    for (int i = 0; i < content.length(); i++) {
      this.characters[i] = new MagneticCharacter(content.charAt(i));
    }
  }

  /**
  * This method will take a string corresponding to the requested message
  * to be put on the sign board and checks if the string can be constructed
  * using available magnetic characters.
  *
  * @param str the proposed message to be checked
  * @return the character we are short of
  */
  public char check(String str) {
    String message = str.replaceAll("\\s+", "");
    for (int i = 0; i < message.length(); i++) {
      boolean notFound = true;
      for (int j = 0; j < this.characters.length; j++) {
        if (this.characters[j].isNotUsed()) {
          if (this.characters[j].getValue() == message.charAt(i)) {
            this.characters[j].use();
            notFound = false;
            break;
          }
        }
      }
      if (notFound) {
        return message.charAt(i);
      }
    }
    return '#';
  }
}
