package main.gameninfo.play;

import main.gameninfo.GamePlayer;
import main.gameninfo.Player;

public class Game {

    private GamePlayer player1;
    private GamePlayer player2;
	
	public Game(Player playerA, Player playerB) {
		this.player1 = (GamePlayer) playerA;
		this.player2 = (GamePlayer) playerB;
	}
}
