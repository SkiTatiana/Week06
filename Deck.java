package Week06FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//represents a deck of playing cards
public class Deck {

	private List<Card> cards = new ArrayList<>();

	//constructor combines one of each value card with each of the four suits to build the list of cards in the deck
	public Deck () {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack","Queen", "King", "Ace"};
		for (String suit : suits) {
			for (int i = 0; i < values.length; i++) {
				Card card = new Card (i + 2, values[i] + " of " + suit);
				cards.add(card);
			}
		}
		
	}
	//mixes up the cards
	public void shuffle() {
		Collections.shuffle(cards);
	}
	//removes the first card and returns it 
	public Card draw() {
		Card card = cards.remove(0);
		return card;
	}
}