/**
 * UMB-CS114-2015F: Introduction to Programming in Java
 * Copyright 2015 Pejman Ghorbanzade <pejman@ghorbanzade.com>
 * More info: https://github.com/ghorbanzade/UMB-CS114-2015F
 */

package edu.umb.cs114.hw05.q01;

/**
* This class provides the main method of the problem.
*
* @author Pejman Ghorbanzade
*/
public class WordCount {
  /**
  * number of most frequent words to print in the report.
  */
  private static final int NUMBER_OF_WORDS = 5;

  /**
  * The main method of this application will process a file with hard-coded
  * file-path and prints the top five most frequent words in the file.
  *
  * @param args command line arguments to be given to this program
  */
  public static void main(String[] args) {
    String filename = "../../src/main/resources/hw05/q01-sample-file.txt";
    String[] strings = FileHandler.getFileContent(filename);
    Word[] words = generateWordList(strings);
    Word[] sortedWords = sortByFrequency(words);
    showMostFrequentWords(sortedWords, NUMBER_OF_WORDS);
  }

  /**
  * This method helps obtain the number of unique words in an array of strings.
  *
  * @param strings an array of strings which represent the words in the file
  * @return the number of unique Words in the array
  */
  private static int getNumUniqueWords(String[] strings) {
    int num = 0;
    Word[] words = new Word[strings.length];
    for (int i = 0; i < strings.length; i++) {
      boolean notFound = true;
      for (int j = 0; j < num; j++) {
        Word word = new Word(strings[i]);
        if (word.getName().equals(words[j].getName())) {
          notFound = false;
          break;
        }
      }
      if (notFound) {
        words[num] = new Word(strings[i]);
        num++;
      }
    }
    return num;
  }

  /**
  * This method converts an array of strings into an array of unique words.
  *
  * @param strings an array of String literals
  * @return an array of Word objects
  */
  private static Word[] generateWordList(String[] strings) {
    int num = 0;
    int size = getNumUniqueWords(strings);
    Word[] words = new Word[size];
    for (int i = 0; i < strings.length; i++) {
      boolean notFound = true;
      for (int j = 0; j < num; j++) {
        Word word = new Word(strings[i]);
        if (word.getName().equals(words[j].getName())) {
          words[j].reoccured();
          notFound = false;
          break;
        }
      }
      if (notFound) {
        words[num] = new Word(strings[i]);
        num++;
      }
    }
    return words;
  }

  /**
  * This method takes an array of Word objects and sorts them using the
  * insertion sort algorithm.
  *
  * @param words an array of Word objects
  * @return an array of Word objects sorted by frequency in descending order
  */
  private static Word[] sortByFrequency(Word[] words) {
    for (int i = 1; i < words.length; i++) {
      int j;
      Word key = words[i];
      for (j = i - 1; j >= 0 && words[j].getFrequency() < key.getFrequency(); j--) {
        words[j + 1] = words[j];
      }
      words[j + 1] = key;
    }
    return words;
  }

  /**
  * This method takes number n and prints n first words of the sorted
  * array of words on the console.
  *
  * @param words    array of words sorted by frequency in descending order
  * @param num      number of frequent words to be printed
  */
  private static void showMostFrequentWords(Word[] words, int num) {
    System.out.printf("Most Frequent Words:\n");
    System.out.printf("%-15s %s\n", "word", "frequency");
    for (int i = 0; i < num; i++) {
      System.out.printf("%-15s %d\n",
                        words[i].getName(),
                        words[i].getFrequency());
    }
  }

  /**
  * This class must not be instantiated
  */
  private WordCount() {
  }
}
