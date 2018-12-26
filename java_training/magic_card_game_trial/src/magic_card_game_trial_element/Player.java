package magic_card_game_trial_element;

import magic_card_game_trial_element_Type_Status.Order;

public class Player {

	private String name;
	
	private int lifePoint;
	
	private Order order;
	
	public Player(String name) {
		this.name = name;
		this.lifePoint = 1000;
	}
	
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public Order getOrder() {
		return this.order;
	}
	
}
