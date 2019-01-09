package main.gameninfo.card;

import main.gameninfo.Player;
import main.gameninfo.field.Totem;

public abstract class Card {

	public Player posessionPlayer;
	
	public String CARD_NAME = "";
	
	public CardType cardType;
	
	public int ATTACK;
	
	public int DEFENCE;
	
	public int COST;
	
	public String EFFECT;
	
	public boolean canExcecute() {
		return false;
	}
	
	public boolean doExecute() {
		return false;
	}
	
	public boolean doExecute(Card card) {
		return false;
	}
	
	//TODO 使わなかったら消しといて
	public boolean doExecute(Player player) {
		return false;
	}

	/**
	 * 攻撃された場合の挙動
	 * @param card 攻撃してきたカード
	 * @return　攻撃の成否
	 */
	public boolean attacked(Card card) {
		if (this.cardType == CardType.SOLDIER) {
			this.DEFENCE = this.DEFENCE - card.ATTACK;
			if (this.canExcecute()) {
				return doExecute();
			}
			
			if (this.DEFENCE < 0) {
				return true;
			} else {
				return false;
			}
			
		} else if (this.cardType == CardType.TRAP) {
			return this.doExecute(card);
			
		} else {
			return false;
		}
	}

	
	public Card(Player player, String cardName) {
		posessionPlayer = player;
		CARD_NAME = cardName;
	}
	public void setATTACK(int attack) {
		ATTACK = attack;
	}
	public void setDEFENCE(int defence) {
		DEFENCE = defence;
	}
	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}
	
}
