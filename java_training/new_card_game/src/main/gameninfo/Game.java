package main.gameninfo;

public class Game {
	
	public Player initewGame() {
		//TODO �Q�[���̏���
		try {
			
			Player player1 = getPlayer(1);
			Player player2 = getPlayer(2);
		
		//TODO �Ǝ���O�̒�`�ƃL���b�`
		} catch (Exception e) {
			
		}
		
		
	}
	
	public Player getPlayer(int playerNo) throws Exception {
		if (playerNo != 1 || playerNo != 2) {
			//TODO UseOriginamException
			throw new Exception();
		}
		Player player = new Player();
		
		return player;
	}

}
