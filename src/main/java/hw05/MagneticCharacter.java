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
*/
public class MagneticCharacter {
  /**
  * a magnetic character object has a value and may have been used or not
  */
  private boolean isNotUsed = true;
  private char value;

  /**
  *
  *
  * @param the content of the box
  */
  public MagneticCharacter(char character) {
    this.value = character;
  }

  /**
  * This method should be invoked to mark the character object as used.
  */
  public void use() {
    this.isNotUsed = false;
  }

  /**
  * This is a simple accessor method that returns whether the character
  * has already been used.
  *
  * @return whether the character has already been used
  */
  public boolean isNotUsed() {
    return this.isNotUsed;
  }

  /**
  * This is a simple accessor method that returns the value of the character.
  *
  * @return the value of magnetic character
  */
  public char getValue() {
    return this.value;
  }
}
