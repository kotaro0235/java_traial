package main.gameninfo;

import java.util.ArrayList;
import java.util.List;

import main.gameninfo.card.Card;
import main.gameninfo.card.CardType;

public class Hand {
	
	public List<Card> hand;
	
	public Hand(Card... cards) {
		hand = new ArrayList<>();
		for (Card card : cards) {
			hand.add(card);
		}
	}
	
	public String showMe(CardType limitByCardType, boolean isAssignNumber) {
		StringBuilder handCardDetails = new StringBuilder();
		String crlf = "\r\n";
		for (Card card : hand) {
			
			// カードタイプで限定する場合
			if (limitByCardType != null 
					&& card.cardType != limitByCardType) {
				continue;
			}
			
			//採番する場合
			if (isAssignNumber) {
				handCardDetails.append("No:");
				handCardDetails.append(hand.indexOf(card));
				handCardDetails.append(crlf);
			}
				
			handCardDetails.append("カード名:");
			handCardDetails.append(card.CARD_NAME);
			handCardDetails.append(crlf);
			
			handCardDetails.append("種類：");
			switch(card.cardType) {
			case SOLDIER:
				handCardDetails.append("ソルジャー");
				break;
			case STRATEGY:
				handCardDetails.append("作戦");
				break;
			case TRAP:
				handCardDetails.append("罠");
				break;
			case FIELD:
				handCardDetails.append("フィールド");
				break;
			default:
			}
			handCardDetails.append(crlf);
			
			handCardDetails.append("効果：");
			handCardDetails.append(card.EFFECT);
			handCardDetails.append(crlf);
			
			if (card.cardType == CardType.SOLDIER) {
				handCardDetails.append("コスト:");
				handCardDetails.append(card.COST);
				handCardDetails.append(crlf);
				
				handCardDetails.append("攻撃力:");
				handCardDetails.append(card.ATTACK);
				handCardDetails.append(crlf);
				
				handCardDetails.append("守備力:");
				handCardDetails.append(card.DEFENCE);
				handCardDetails.append(crlf);
			}
		}
		return handCardDetails.toString();
	}
	
	public boolean useByIndex(int index) {
		return hand.get(index).doExecute();
	}
	
	public boolean dropByIndex(int index) {
		return false;
	}
}
