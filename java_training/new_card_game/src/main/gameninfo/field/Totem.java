package main.gameninfo.field;

import main.gameninfo.Player;
import main.gameninfo.card.Card;
import main.gameninfo.card.CardType;

/**
 * TotemはFieldによって初期化される
 * Fieldの所有物
 * 
 * @author damay
 *
 */
public class Totem {

	public Player occupyedPlayer;

	public Card occupyedCard;
	
	//TODO あとでCard側で使わなかったら、privateにする
	public boolean canOccupyMe() {
		if (occupyedPlayer == null && occupyedCard == null) {
			return true;
		} else {
			return false;
		}
	}
	
	//Trapセット状態は相手から見て攻撃可能なので、その状態の判断←今更ながらルールブック(仕様書)がないのであいまいだな
	//TODO やりたいことはTrapがあっても攻撃できることを判断する、なのでMethod名がいけていない
	//TODO あとでCard側で使わなかったらprivateにする
	public boolean canAttackMe() {
		if (occupyedPlayer == null) {
			return true;
		}
		return false;
	}
	
	public boolean occupyMe(Player player, Card card) {
		if (canOccupyMe()) {
			occupyedPlayer = player;
			occupyedCard = card;
			return true;
		}
		return false;
	}
	
	public void unOccupy() {
		occupyedPlayer = null;
		occupyedCard = null;
	}
	

	public void setTrap(Card card) {
		if (canOccupyMe() && card.cardType == CardType.TRAP) {
			occupyedCard = card;
		}
	}
	
	private void attackMe(Player player, Card card) {
		if(occupyedCard.attacked(card)) {
			occupyMe(player, card);
		}
	}

	public void attacked(Player player, Card card) {
		if (occupyMe(player, card)) {
		} else if(canAttackMe()) {
			attackMe(player, card);
		}
		
	}
	
}
