package function;

import entity.Tabuleiro;

public class FuncaoUtilidade {

	private static Integer valorSimples = 1;
	private static Integer valorDupla = 10;
	private static Integer valorTripla = 1000;
	private static Integer valorQuadrupla = 1000000;
	private static Integer valorQuintupla = Integer.MAX_VALUE;

	
	
	public static Long calculaValorSequencia(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
		
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){
					sum += valorSimples;
					//peça vizinha ao lado direito
					// XXXXX				
					aux1 = i;
					aux2 = j + 1;
					if(aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
						//peças do meio
						aux2 = j+2;
						if(aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorTripla;
							aux2 = j+3;
							if(aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorQuadrupla;
								aux2 = j+4;
								if(aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorQuintupla;
								}
							}
							
						}
						
					}
					
					//peça vizinha a diagonal para esquerda a baixo
					//    X
					//   X
					//  X
					// X
					//X
					aux1 = i + 1;
					aux2 = j - 1;
					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
						//peças do meio
						aux1 = i + 2;
						aux2 = j - 2;
						if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorTripla;
							aux1 = i + 3;
							aux2 = j - 3;
							if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorQuadrupla;
								aux1 = i + 4;
								aux2 = j - 4;
								if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorQuintupla;
								}
							}
							
						}
					}
					
					//peça vizinha direto abaixo
					//  X
					//  X
					//  X
					//  X
					//  X
					aux1 = i + 1;
					aux2 = j;
					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
						//peças do meio
						aux1 = i + 2;						
						if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorTripla;
							aux1 = i + 3;						
							if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorQuadrupla;
								aux1 = i + 4;						
								if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorQuintupla;
								}
							}
						}						
					}
					
					//peça vizinha  a diagonal a direita abaixo
					//  X
					//   X
					//    X
					//     X
					//      X
					aux1 = i + 1;
					aux2 = j + 1;
					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
						aux1 = i + 2;
						aux2 = j + 2;
						if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorTripla;
							aux1 = i + 3;
							aux2 = j + 3;
							if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorQuadrupla;
								aux1 = i + 4;
								aux2 = j + 4;
								if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorQuintupla;
								}
							}
						}
						
					}	
						
				}				
			}			
		}		
	return sum;	
	}
}
