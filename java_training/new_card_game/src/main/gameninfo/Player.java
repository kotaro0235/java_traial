package main.gameninfo;

import java.util.ArrayList;
import java.util.List;

import main.gameninfo.card.Card;
import main.gameninfo.card.CardType;
import main.gameninfo.field.Strategy;

public class Player {

	public int id;
	
	public Deck deck;
	public int turnCnt;
	public Hand hand;
	public AfterOrBefore afterOrBefore;
	public Strategy strategy;
	
	public Player(int id) {
		deck = new Deck(true);
		turnCnt = 0;
		this.id = id;
	}

	public void init(AfterOrBefore afterOrBefore) {
		this.deck.init();
		this.hand.set(this.deck.drow());
		this.afterOrBefore = afterOrBefore;
	}
	
	public boolean equals(Player player) {
		return this.id == player.id ? true : false;
	}
	
	public void drow() {
		this.hand.add(this.deck.drow(turnCnt + 4));
	}
	
	public List<Card> getPlayableHand(CardType... cardTypes) {
		
		List<Card> playableCard = new ArrayList<>();
		for (Card card : hand) {
			for (CardType cardType : cardTypes) {
				if (card.cardType)
			}
		}
	}
}
