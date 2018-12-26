package magic_card_game_trial_element;

import java.util.Random;

import magic_card_game_trial_element_Type_Status.Order;

public class Game {
	
	public Game(Player player1, Player player2) {
		
		player1.setOrder(chooseOrderAsRandom());
		if(player1.getOrder() == Order.AFTER) {
			player2.setOrder(Order.BEFORE);
		} else {
			player2.setOrder(Order.AFTER);
		}
		
		
		while(true) {
			
			
			
		}
	}
	
	public Order chooseOrderAsRandom() {
		Random random = new Random();
		int comparation = random.nextInt(9);
		
		if (comparation > 4) {
			return Order.AFTER;
		} else {
			return Order.BEFORE;
		}
	}

}
