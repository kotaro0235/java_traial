package main.gameninfo.card;

import main.gameninfo.Phase;

public abstract class Card {

	//�S�̋���
	public String CARD_NAME = "";
	public abstract Object doExecute(Object object);
	public abstract boolean isPlayable(Phase phase);
	
	//�\���W���[�ŗL
	public int ATTACK;
	public int DEFENCE;
	public int COST;
	
	
	
}
