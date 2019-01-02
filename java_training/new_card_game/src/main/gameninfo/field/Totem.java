package main.gameninfo.field;

import main.gameninfo.Player;
import main.gameninfo.card.Card;

public class Totem {

	public Player occupyedPlayer;
	public Card occupyedCard;
	
	public Totem() {
		
	}
	
	public boolean canOccupyTotem() {
		if (occupyedPlayer == null && occupyedCard == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public Totem occupyTotem(Player player, Card card) {
		
		if (occupyedPlayer == null && occupyedCard == null) {
			occupyedPlayer = player;
			occupyedCard = card;
		} else {
			if(occupyedCard.attacked(player, card)) {
				occupyedPlayer = player;
				occupyedCard = card;
			}
		}
		return this;
	}
	
	public Totem unOccupy() {
		occupyedPlayer = null;
		occupyedCard = null;
		return this;
	}
	
	
}
