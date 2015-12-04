/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw05.q01;

/**
* A Word is defined as a string literal that has occured in the context of
* concern for a certain number of times.
*
* @author Pejman Ghorbanzade
* @see Word
*/
public class Word {
  /**
  * A word object has a string literal representation and a certain frequency
  * of occurrence.
  */
  private String name;
  private int frequency;

  /**
  * This constructor removes punctuations from the string literal and
  * converts it to lowercase.
  *
  * @param name the string literal to construct word from
  */
  public Word(String name) {
    this.name = name.replaceAll("\\p{P}", "").toLowerCase();
    this.frequency = 1;
  }

  /**
  * This method is called when a string literal found in the content is already
  * included in the word list, in which case the frequency of that word should
  * be incremented by one.
  */
  public void reoccured() {
    this.frequency++;
  }

  /**
  * The getter method for the name attribute.
  *
  * @return a string representation of the word
  */
  public String getName() {
    return this.name;
  }

  /**
  * The getter method for the frequency attribute.
  *
  * @return the number of occurances of the word
  */
  public int getFrequency() {
    return this.frequency;
  }
}
