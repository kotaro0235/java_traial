package main.gameninfo.play;

import main.gameninfo.Player;

public class DrowPhase {
	
	public static void doExecute(Player nowPlayer, Player nextPlayer) throws Exception {
		nowPlayer.drow();
		
		String UIstr = "あなたのターンです。カードをドローしました" + "\r\n";
		for (int i = 0; i <= nowPlayer.hand.getSize(); i++) {
			UIstr = "カードNo ： " + i + "\r\n";
			UIstr = "カード名　： " + nowPlayer.hand.get(i).CARD_NAME + "\r\n";
			UIstr = "効果　： " + nowPlayer.hand.get(i).EFFECT + "\r\n";
		}
		
		Thread.sleep(10000);
		
	}


}
