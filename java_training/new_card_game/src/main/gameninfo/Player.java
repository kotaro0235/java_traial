package main.gameninfo;

public class Player {

	public int id;
	public Deck deck;
	
	public Player(int id) {
		deck = new Deck();
		this.id = id;
	}
	
	public boolean equals(Player player) {
		return this.id == player.id ? true : false;
	}
}
