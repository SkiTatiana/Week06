package Week06FinalProject;

import java.util.ArrayList;
import java.util.List;

//represents players
public class Player {
	private List<Card> hand = new ArrayList<>();
	private int score = 0;
	private String name = "";
//fields of a player
	public Player (String name) {
		this.name = name;
		this.score = 0;
	}
	//setter and getters
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	//method displays info on the player and score
	public void describe() {
		System.out.println("Player " + name + " has a score of: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	//removes first card and returns it
	public Card flip() {
		return hand.remove(0);		
	}
	//draws a card from the deck and adds it to players hand 
	public void draw (Deck deck) {
		hand.add(deck.draw());
	}

	public int incrementScore() {
		return score++;
	}
}
