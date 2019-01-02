package main.gameninfo.play;

import main.gameninfo.AfterOrBefore;
import main.gameninfo.field.Fields;
import main.gameninfo.Player;

public class Game {
	
	Player player1;
	Player player2;
	
	public Fields fields;
	
	
	public Game(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public void doExecute() {
        this.fields = newGame();
		
		while (true) {
			doGame(player1, player2);
			doGame(player2, player1);
		}
	}
	
	public Fields newGame() {
		player1.id = 1;
		player2.id = 2;
		
		player1.init(AfterOrBefore.AFTER);
		player2.init(AfterOrBefore.BEFORE);
		
		return new Fields();
	}
	
	public Player doJudge() {
		return null;
	}
	
	public void doGame(Player nowPlayer, Player nextPlayer) {
		// DrowPhase
		try {
			DrowPhase.doExecute(nowPlayer, nextPlayer);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		// StrategyPhase
		try {
			StrategyPhase.doExecute(nowPlayer, nextPlayer);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
