package Week06FinalProject;

public class App {

	public static void main(String[] args) {
		//instantiating deck and players
		Player player1 = new Player("Bob");
		Player player2 = new Player("Jim");
		Deck deck = new Deck();
		
		//calling the shuffle method on the deck
		deck.shuffle();
		
		for (int i=0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		//loops through the 26 turns 
		for (int j = 0; j < 26; j++) {
			//reveals each players card for that turn
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			//compares values of each players card 
			if (card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " received a point - " + card1.getName() + " beats " + card2.getName());
			}else if (card1.getValue() < card2.getValue()){
				player2.incrementScore();
				System.out.println(player2.getName() + " received a point - " + card2.getName() + " beats " + card1.getName());
			//if it is a tie...
			}else {
				System.out.println("Sorry, no point was awarded. " + card1.getName() + " matches " + card2.getName());
			}
			System.out.println(player1.getName() + " has " + player1.getScore() + " point(s), " + player2.getName() + " has " + player2.getScore() + " point(s)");
		}

		System.out.println("**********");
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " wins!");
			System.out.println("**********");
			System.out.println(player1.getName() + "'s score: " + player1.getScore());
			System.out.println(player2.getName() + "'s score: " + player2.getScore());
		}else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " wins!");
			System.out.println("**********");
			System.out.println(player2.getName() + "'s score: " + player2.getScore());
			System.out.println(player1.getName() + "'s score: " + player1.getScore());
		}else {
			System.out.println("It's a draw!");
			System.out.println("**********");
			System.out.println(player1.getName() + "'s score: " + player1.getScore());
			System.out.println(player2.getName() + "'s score: " + player2.getScore());
		}
		
		
	}

}
