package main.gameninfo.card;

import main.gameninfo.Phase;

public abstract class Card {

	//全体共通
	public String CARD_NAME = "";
	public abstract Object doExecute(Object object);
	public abstract boolean isPlayable(Phase phase);
	
	//ソルジャー固有
	public int ATTACK;
	public int DEFENCE;
	public int COST;
	
	
	
}
