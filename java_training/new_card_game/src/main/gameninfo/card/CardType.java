package main.gameninfo.card;

import main.gameninfo.play.Phase;

public enum CardType {

	SOLDIER(Phase.ADVANCEMENT_PHASE),
	STRATEGY(Phase.STRATEGY_PHASE),
	TRAP(Phase.STRATEGY_PHASE),
	FIELD(Phase.STRATEGY_PHASE);
	
	private Phase[] phase;
	
	private CardType(Phase... phase) {
		this.phase = phase;
	}
	
	public Phase[] getPlayablePhase() {
		return this.phase;
	}
	
}
