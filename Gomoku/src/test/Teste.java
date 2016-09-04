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
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 7, 9);
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
		
		Long simples1 = FuncaoUtilidade.calculaValorSequenciaSimples(tab, player.getValorPeca());
		System.out.println("simples player 1 " + simples1);
		
		
		Long dupla1 = FuncaoUtilidade.calculaValorSequenciaDupla(tab, player.getValorPeca());
		System.out.println("dupla player 1 " + dupla1);
		
		Long tripla1 = FuncaoUtilidade.calculaValorSequenciaTripla(tab, player.getValorPeca());
		System.out.println("tripla player 1 " + tripla1);
		
		Long quadrupla1 = FuncaoUtilidade.calculaValorSequenciaQuadrupla(tab, player.getValorPeca());
		System.out.println("quadrupla player 1 " + quadrupla1);
		
		Long quintupla1 = FuncaoUtilidade.calculaValorSequenciaQuintupla(tab, player.getValorPeca());
		System.out.println("quintupla player 1 " + quintupla1);
		
		
	}
}
