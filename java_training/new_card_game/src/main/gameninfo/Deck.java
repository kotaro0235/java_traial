package main.gameninfo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import main.gameninfo.card.Card;

public class Deck {

	public List<Card> deck;
	
	public Deck(boolean createDeck) {
		if (createDeck) {
			while (true) {
			}
			
			
		} else {
			if (deck == null) throw new Error();
		}
	}

	public List<Card> drow() {
		List<Card> newHand =  Arrays.asList(
			deck.get(0),
			deck.get(1),
			deck.get(2),
			deck.get(3),
			deck.get(4));

		deck.remove(newHand);
		
		return newHand;
	}
	
	public void init() {
		Collections.shuffle(deck);
	}
	
	public Card drow(int index) {
		return deck.get(index);
	}
	
}
