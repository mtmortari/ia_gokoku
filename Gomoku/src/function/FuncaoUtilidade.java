package function;

import entity.Tabuleiro;

public class FuncaoUtilidade {

	public static Integer calculaValorSequenciaSimples(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Integer sum = 0;
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){
					sum += 1;
				}
				
			}
			
		}
		
	return sum;	
	}
}
