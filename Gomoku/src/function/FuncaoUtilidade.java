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
	
	
	public static Integer calculaValorSequenciaDupla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Integer sum = 0;
		Integer valorDupla = 10;
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){					
					//peça vizinha ao lado direito
					// XX				
					aux1 = i;
					aux2 = j + 1;
					if(aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
					}
					
					//peça vizinha a diagonal para esquerda a baixo
					//  X
					// X
					aux1 = i + 1;
					aux2 = j - 1;
					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
					}
					
					//peça vizinha direto abaixo
					//  X
					//  X
					aux1 = i + 1;
					aux2 = j;
					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
					}
					
					//peça vizinha  a diagonal a direita abaixo
					//  X
					//   X
					aux1 = i + 1;
					aux2 = j + 1;
					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						sum += valorDupla;
					}	
						
				}				
			}			
		}		
	return sum;	
	}
	
	public static Integer calculaValorSequenciaTripla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Integer sum = 0;
		Integer valorSequencia = 1000;
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){					
					//peça vizinha ao lado direito
					// XXX				
					aux1 = i;
					aux2 = j + 2;
					if(aux2 < size &&  tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peça do meio
						aux2 = j+1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorSequencia;
						}
						
					}
					
					//peça vizinha a diagonal para esquerda a baixo
					//  X
					// X
					//X
					aux1 = i + 2;
					aux2 = j - 2;
					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peça do meio
						aux1 = i + 1;
						aux2 = j - 1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorSequencia;
						}
					}
					
					//peça vizinha direto abaixo
					//  X
					//  X
					//  X
					aux1 = i + 2;
					aux2 = j;
					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){						
						//peça do meio
						aux1 = i + 1;
						aux2 = j;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorSequencia;
						}						
					}
					
					//peça vizinha  a diagonal a direita abaixo
					//  X
					//   X
					//    X
					aux1 = i + 2;
					aux2 = j + 2;
					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						aux1 = i + 1;
						aux2 = j + 1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorSequencia;
						}
						
					}	
						
				}				
			}			
		}		
	return sum;	
	}
	
	public static Integer calculaValorSequenciaQuadrupla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Integer sum = 0;
		Integer valorSequencia = 1000000;
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){					
					//peça vizinha ao lado direito
					// XXXX				
					aux1 = i;
					aux2 = j + 2;
					if(aux2 < size &&  tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peça do meio
						aux2 = j+1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							sum += valorSequencia;
						}
						
					}
					
//					//peça vizinha a diagonal para esquerda a baixo
//					//  X
//					// X
//					//X
//					aux1 = i + 2;
//					aux2 = j - 2;
//					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
//						//peça do meio
//						aux1 = i + 1;
//						aux2 = j - 1;
//						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
//							sum += valorSequencia;
//						}
//					}
//					
//					//peça vizinha direto abaixo
//					//  X
//					//  X
//					//  X
//					aux1 = i + 2;
//					aux2 = j;
//					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){						
//						//peça do meio
//						aux1 = i + 1;
//						aux2 = j;
//						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
//							sum += valorSequencia;
//						}						
//					}
//					
//					//peça vizinha  a diagonal a direita abaixo
//					//  X
//					//   X
//					//    X
//					aux1 = i + 2;
//					aux2 = j + 2;
//					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
//						aux1 = i + 1;
//						aux2 = j + 1;
//						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
//							sum += valorSequencia;
//						}
//						
//					}	
						
				}				
			}			
		}		
	return sum;	
	}
}
