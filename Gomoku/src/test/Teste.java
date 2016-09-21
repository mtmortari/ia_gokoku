package test;

import javax.swing.JOptionPane;

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
	
		int row, column;
		boolean win = false;
		
		while(win != true)
		{
			//jogador 1
			row = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 informe valor para a linha!"));
			column = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1 informe valor para a coluna!"));
			tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), row, column);
			GUI.showTabuleiro(tab);
			
			if(tab.verificarVitoria(tab, player))
			{
				System.out.println("Player 1 ganhou!");
				break;
			}
				
			
			//jogador 2
			row = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 informe valor para a linha!"));
			column = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2 informe valor para a coluna!"));
			tab.colocaPecaDoJogadorNoTabuleirio(player2.getValorPeca(), row, column);
			GUI.showTabuleiro(tab);
			if(tab.verificarVitoria(tab, player2))
			{
				System.out.println("Player 1 ganhou!");
				break;
			}			
		}
	}
		
	public void teste2(){
		Tabuleiro tab = new Tabuleiro();	
		tab.createEmptyTabuleiro();
		Player player = new Player("mathias", Constants.PLAYER_O);
		
		
		GUI.showTabuleiro(tab);
		
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
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 12, 12);
		tab.colocaPecaDoJogadorNoTabuleirio(player.getValorPeca(), 14, 14);
		
	
		GUI.showTabuleiro(tab);
		
		Long seq = FuncaoUtilidade.calculaValorSequencia(tab, player.getValorPeca());
		System.out.println("simples player 1 " + seq);
	}
}
