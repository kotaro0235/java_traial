package main.gameninfo;

import java.util.List;
import main.gameninfo.card.Card;

public class Deck {

	public List<Card> deck;
	
	public Deck(boolean createDeck) {
		if (createDeck) {
			while (true) {
				//TODO　カードの選択処理
			}
			
			
		} else {
			//TODO 独自エラーの定義
			if (deck == null) throw new Error();
		}
	}
	
//	private Card chooseCard() {
//		
//		Card choosenCard = new Card();
//		
//		return Card; 
//	}
	
}
