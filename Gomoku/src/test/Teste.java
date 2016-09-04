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
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 6);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 8, 8);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 8);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 5);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 7);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 9, 9);
		
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 14, 0);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 14, 14);
		
		
		
		
//		tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), 7, 6);
//		tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), 6, 6);
	
		GUI.showTabuleiro(tab);
		
		Integer simples1 = FuncaoUtilidade.calculaValorSequenciaSimples(tab, player.getValorPeca());
		System.out.println("simples player 1 " + simples1);
		
		
		Integer dupla1 = FuncaoUtilidade.calculaValorSequenciaDupla(tab, player.getValorPeca());
		System.out.println("dupla player 1 " + dupla1);
		
		Integer tripla1 = FuncaoUtilidade.calculaValorSequenciaTripla(tab, player.getValorPeca());
		System.out.println("tripla player 1 " + tripla1);
		
		
	}
}
