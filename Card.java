package Week06FinalProject;
//represents a single playing card
public class Card {
	
	
	//creating variable for card properties
	private int value = 0;
	private String name = "0";
	
	
	//constructor  
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	//getters for card's fields 
	public int getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}
	
	//method to display card info 
	public void describe() {
		System.out.println(name);
	}
}
