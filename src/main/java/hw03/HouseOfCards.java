/**
* CS114: Introduction to Java
* Copyleft 2015 Pejman Ghorbanzade <mail@ghorbanzade.com>
* More info: https://github.com/ghorbanzade/UMB-CS114-2015F
*
* The author has placed this file in the public domain.
* He makes no warranty and accepts no liability for this file.
*/

package edu.umb.cs114.hw03.q1;

public class HouseOfCards {
	public static void main(String[] args) {
		int[] card1 = generateCard();
		int[] card2 = generateCard();
		printCardName(card1[0], card1[1]);
		printCardName(card2[0], card2[1]);
		if (card1.equals(card2))
			System.out.println("Cards are the same");
		else if (card1[0] == card2[0])
			System.out.println("Cards share the same suit.");
		else if (card1[1] == card2[1])
			System.out.println("Cards share the same rank.");
		else
			System.out.println("Cards do not share rank or suit.");
	}
	public static int[] generateCard() {
		int[] card = new int[2];
		int num = (int) Math.floor(Math.random() * 52);
		card[0] = num / 13;
		card[1] = num % 13;
		return card;
	}
	public static void printCardName(int suitNum, int rankNum) {
		String[] suitNames = {
			"Spades", "Diamonds", "Clubs", "Hearts"
		};
		String[] cardNames = {
			"Ace", "Two", "Three", "Four", "Five",
			"Six", "Seven", "Eight", "Nine", "Ten",
			"Soldier", "Queen", "King"
		};
		System.out.printf("%s of %s\n", cardNames[rankNum], suitNames[suitNum]);
	}
}
