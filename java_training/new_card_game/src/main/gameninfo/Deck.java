package main.gameninfo;

import java.util.List;
import main.gameninfo.card.Card;

public class Deck {

	public List<Card> deck;
	
	public Deck(boolean createDeck) {
		if (createDeck) {
			while (true) {
				//TODO�@�J�[�h�̑I������
			}
			
			
		} else {
			//TODO �Ǝ��G���[�̒�`
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
