import constants.Constants;
import entity.Player;
import entity.Tabuleiro;
import gui.GUI;

public class Main {

	public static void main(String[] args) {
		Tabuleiro tab = new Tabuleiro();	
		tab.createEmptyTabuleiro();
		Player player = new Player("mathias", Constants.PLAYER_O);
		Player player2 = new Player("paulo", Constants.PLAYER_X);
		
		
		GUI.showTabuleiro(tab);
		int row = GUI.showPlayerTurn(player);
		int column = GUI.getColumnTurn();
		
		String msg = tab.colocaPecaDoJogadorNoTabuleirio(player, row, column);
		
		GUI.showTabuleiro(tab);
		
	}

}
