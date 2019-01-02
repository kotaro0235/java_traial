package main.gameninfo.play;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;

import main.gameninfo.Player;
import main.gameninfo.card.Card;

public class StrategyPhase {
	
	public static void doExecute(Player nowPlayer, Player nextPlayer) throws Exception {
		if (nowPlayer.strategy == null) {
			Map<Integer, Card> strategyList = nowPlayer.hand.getPlayableFromHand(Phase.STRATEGY_PHASE);
			String UIStr = "以下のカードのなかから発動したい番号を入力してください。フェーズをスキップする場合は99を入力してください";
			for (int i = 0; i < strategyList.size(); i++) {
				Card card = strategyList.get(i);
				UIStr = "*********No" + i + "*********" + "\r\n";
				UIStr = "カード名：" + card.CARD_NAME + "\r\n";
				UIStr = "効果：" + card.EFFECT + "\r\n";
			}
			System.out.println(UIStr);
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			
			int choosenNo = Integer.parseInt(buf);
			
			if (choosenNo == 99) {
				return;
			} else {
				strategyList.get(choosenNo).doExecute();
			}
		}
	}

}
