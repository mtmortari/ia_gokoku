package gui;

import java.util.Scanner;

import entity.Player;
import entity.Tabuleiro;

public class GUI {

	private static String demilitador = "  ";
	private static String demilitadorMenor = " ";
	
	static public void showTabuleiro(Tabuleiro tab){
		Integer size = tab.getSize();
		
		for(int k = 0; k < size; k++){
			if(k < 10){
				System.out.print(k + demilitador);
			} else {
				System.out.print(k + demilitadorMenor);
			}
			
		}
		System.out.println();
		
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				System.out.print(tab.getEstado()[i][j] + demilitador);
			}
			System.out.println(demilitador + i);
		}
	}
	
	static public int showPlayerTurn(Player player){
		System.out.println("É a vez do jogador " + player.getName());
		System.out.println("por favor selecione a linha onde você vai querer jogar:");
	
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		return row;
	}
	
	static public int getColumnTurn(){
		System.out.println("Por favor selecione a coluna: ");
		
		Scanner in = new Scanner(System.in);
		int column = in.nextInt();
		return column;
	}
	
	
}
