package main.gameninfo.card;

import main.gameninfo.Player;
import main.gameninfo.field.Totem;
import main.gameninfo.play.Phase;

public abstract class Card {

	public Player posessionPlayer;
	public String CARD_NAME = "";
	public CardType cardType;
	public abstract Object doExecute();
	public abstract boolean isPlayable(Phase phase);
	public abstract boolean attacked(Card card);
	public abstract boolean canAttacked(Player player);
	public abstract Totem summon(Totem totem);
	
	public int ATTACK;
	public int DEFENCE;
	public int COST;
	public String EFFECT;
	
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
