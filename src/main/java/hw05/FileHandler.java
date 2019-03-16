/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw05.q01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* This class provides a simple way to get the content of a given file.
* The purpose for developing this class is to enable solving the word-count
* problem without the need to know exception handling which is not part of
* CS114 curriculum.
*
* @author Pejman Ghorbanzade
*/
public class FileHandler {
  /**
  * This method will return the content of a file whose relative path is
  * given in form of an array of Strings. In case the file is not found
  * the exception is caught and the error is printed. The purpose of catching
  * the exception is to remove the need to enclose the method in try-catch
  * block.
  *
  * @param filepath the path to the file to be read
  * @return an array of strings containing the words in the given file.
  */
  public static String[] getFileContent(String filepath) {
    try {
      int index = 0;
      String[] words = new String[getNumWordsInFile(filepath)];
      File file = new File(filepath);
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        words[index++] = input.next();
      }
      input.close();
      return words;
    } catch (FileNotFoundException e) {
      e.printStackTrace();
      return new String[1];
    }
  }

  /**
  * This method returns the number of words in the file whose path is given.
  * The method will throw an exception if the specified file is not found.
  *
  * @param filepath the path to the file to be read
  * @return the number of words in the file
  * @throws FileNotFoundException
  */
  private static int getNumWordsInFile(String filepath)
          throws FileNotFoundException {
    int numWords = 0;
    File file = new File(filepath);
    Scanner input = new Scanner(file);
    while (input.hasNext()) {
      input.next();
      numWords++;
    }
    input.close();
    return numWords;
  }

  /**
  * This class must not be instantiated.
  */
  private FileHandler() {
  }
}
