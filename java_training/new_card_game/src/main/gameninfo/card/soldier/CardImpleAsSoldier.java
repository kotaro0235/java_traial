package main.gameninfo.card.soldier;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

import main.gameninfo.Fields;
import main.gameninfo.Phase;
import main.gameninfo.Player;
import main.gameninfo.Totem;
import main.gameninfo.card.Card;
import main.gameninfo.card.CardType;

public abstract class CardImpleAsSoldier extends Card {

	public CardImpleAsSoldier(Player player,String cardName, int attack, int defence, int cost) {
		super(player, cardName);
		super.ATTACK = attack;
		super.DEFENCE = defence;
		super.COST = cost;
		super.setCardType(CardType.SOLDIER);
	}

	@Override
	public Object doExecute(Object object) {
		return null;
	}
	

	@Override
	public boolean canAttacked(Player player) {
		if(posessionPlayer.equals(player)) {
			return false;
		}
		return true;
	}
	
	@Override
	public boolean attacked(Card card) {
		if (!canAttacked(card.posessionPlayer)) {
			super.DEFENCE = super.DEFENCE - card.ATTACK;
		}
		if(super.DEFENCE < 0) {
			return false;
		}
		return true;
	}
	
	public Totem summon(Totem totem) {
		totem.occupyedPlayer = this.posessionPlayer;
		totem.occupyedCard = this;
		
		return totem;
	}

	
}
