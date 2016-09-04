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
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 7);
		
		
		tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), 7, 6);
		tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), 6, 6);
	
		GUI.showTabuleiro(tab);
		
		Integer simples1 = FuncaoUtilidade.calculaValorSequenciaSimples(tab, player.getValorPeca());
		Integer simples2 = FuncaoUtilidade.calculaValorSequenciaSimples(tab, player2.getValorPeca());
		
		System.out.println("simples player 1 " + simples1);
		System.out.println("simples player 2 " + simples2);
		
	}
}
