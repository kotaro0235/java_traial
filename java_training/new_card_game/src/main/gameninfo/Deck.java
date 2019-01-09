package main.gameninfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import main.gameninfo.card.Card;

public class Deck {

	public List<Card> deck;
	
	private final int limitDeckSize = 40;
	private final int offsetDeckSize = 20;
	
	public Deck() {
		this.deck = new ArrayList<>();
	}
	
	public void init() {
		Collections.shuffle(deck);
	}
	
	public Card drow(int index) {
		return deck.get(index);
	}
	
	public Card drop(int index) {
		return deck.remove(index);
	}
	
	public boolean construct(Card... cards) {
		int argsSize = cards.length;
		if (offsetDeckSize <= argsSize && limitDeckSize >= argsSize) {
			this.deck = Arrays.asList(cards);
			return true;
		}
		return false;
	}
	
}
