package function;

import entity.Tabuleiro;

public class FuncaoUtilidade {

	public static Long calculaValorSequenciaSimples(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){
					sum += 1;
				}				
			}			
		}		
	return sum;	
	}
	
	
	public static Long calculaValorSequenciaDupla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
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
	
	public static Long calculaValorSequenciaTripla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
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
	
	public static Long calculaValorSequenciaQuadrupla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
		Integer valorSequencia = 1000000;
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){					
					//peça vizinha ao lado direito
					// XXXX				
					aux1 = i;
					aux2 = j + 3;
					if(aux2 < size &&  tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peças do meio
						aux2 = j+2;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux2 = j+1;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorSequencia;
							}
							
						}
						
					}
					
					//peça vizinha a diagonal para esquerda a baixo
					//   X
					//  X
					// X
					//X
					aux1 = i + 3;
					aux2 = j - 3;
					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peças do meio
						aux1 = i + 2;
						aux2 = j - 2;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 1;
							aux2 = j - 1;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorSequencia;
							}
							
						}
					}
					
					//peça vizinha direto abaixo
					//  X
					//  X
					//  X
					//  X
					aux1 = i + 3;
					aux2 = j;
					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){						
						//peças do meio
						aux1 = i + 2;						
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 1;						
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorSequencia;
							}
						}						
					}
					
					//peça vizinha  a diagonal a direita abaixo
					//  X
					//   X
					//    X
					//     X
					aux1 = i + 3;
					aux2 = j + 3;
					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						aux1 = i + 2;
						aux2 = j + 2;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 1;
							aux2 = j + 1;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								sum += valorSequencia;
							}
						}
						
					}	
						
				}				
			}			
		}		
	return sum;	
	}
	
	public static Long calculaValorSequenciaQuintupla(Tabuleiro tab, String pecaJogador){
		Integer size = tab.getSize();
		Long sum = 0L;
		Integer valorSequencia = 1000000000;
		int aux1, aux2;  //para controle de index out of bounds e ajuda a buscar o vizinho da peça
		for(int i = 0; i < size; i++){			
			for(int j = 0; j < size; j++){
				if(tab.getEstado()[i][j].equals(pecaJogador)){					
					//peça vizinha ao lado direito
					// XXXXX				
					aux1 = i;
					aux2 = j + 4;
					if(aux2 < size &&  tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peças do meio
						aux2 = j+1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux2 = j+2;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								aux2 = j+3;
								if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorSequencia;
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
					aux1 = i + 4;
					aux2 = j - 4;
					if(aux1 < size && aux2 > 0 && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						//peças do meio
						aux1 = i + 1;
						aux2 = j - 1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 2;
							aux2 = j - 2;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								aux1 = i + 3;
								aux2 = j - 3;
								if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorSequencia;
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
					aux1 = i + 4;
					aux2 = j;
					if(aux1 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){						
						//peças do meio
						aux1 = i + 1;						
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 2;						
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								aux1 = i + 3;						
								if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorSequencia;
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
					aux1 = i + 4;
					aux2 = j + 4;
					if(aux1 < size && aux2 < size && tab.getEstado()[aux1][aux2].equals(pecaJogador)){
						aux1 = i + 1;
						aux2 = j + 1;
						if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
							aux1 = i + 2;
							aux2 = j + 2;
							if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
								aux1 = i + 3;
								aux2 = j + 3;
								if(tab.getEstado()[aux1][aux2].equals(pecaJogador)){
									sum += valorSequencia;
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
