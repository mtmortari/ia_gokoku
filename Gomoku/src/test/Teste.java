package test;

import constants.Constants;
import entity.Player;
import entity.Tabuleiro;
import function.FuncaoUtilidade;
import gui.GUI;

public class Teste {

	public void teste1(){
		Tabuleiro tab = new Tabuleiro();	
		tab.createEmptyTabuleiro();
		Player player = new Player("mathias", Constants.PLAYER_O);
		Player player2 = new Player("paulo", Constants.PLAYER_X);
		
		
//		GUI.showTabuleiro(tab);
		
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 8);
		tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), 7, 9);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 10);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 11);
		
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 6);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 8);
				
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 5);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 9);
				
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 10, 4);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 10, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 10, 10);
		
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 11, 3);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 11, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 11, 11);
		
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 14, 0);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 14, 14);
		
	
		GUI.showTabuleiro(tab);
		Long valor = FuncaoUtilidade.calcularValorTabuleirio(tab, player.getValorPeca(), player2.getValorPeca());
		System.out.println("valor tab " + valor);
		
		
	}
}
