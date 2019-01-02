package main.gameninfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.gameninfo.card.Card;
import main.gameninfo.play.Phase;

public class Hand {
	
	public Map<Integer, Card> hand;
	
	public Hand() {
		hand = new HashMap<Integer, Card>();
	}
	
	public void set(List<Card> cards) {
		int max = hand.size();
		for (Card card : cards) {
			hand.put(max, card);
			++max;
		}
	}
	
	public void set(Card card) {
		int max = hand.size();
		hand.put(max, card);
	}
	
	public int getSize() {
		return hand.size();
	}
	
	public Card get(int index) {
		return hand.get(index);
	}
	
	public Map<Integer,Card> getPlayableFromHand(Phase phase) {
		Map<Integer,Card> nowPlayable = hand;
		for (int i = 0; 0 < hand.size(); i++) {
			if (!hand.get(i).isPlayable(phase)) {
				nowPlayable.remove(hand.get(i));
			}
		}
		return nowPlayable;
	}

}
