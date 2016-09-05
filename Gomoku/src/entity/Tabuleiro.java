package entity;

import constants.Constants;
import function.FuncaoUtilidade;

public class Tabuleiro {
	
	private String[][] estado;

	public final Integer size = 15;
	
	public Integer getSize() {
		return size;
	}

	public String colocaPecaDoJogadorNoTabuleirio(String valorPeca, int row, int column){
		if(row > size && column > size){
			return "Erro: linha ou coluna não existe";
		}		
		this.estado[row][column] = valorPeca;
		return null;
	}
	
	
	public void createEmptyTabuleiro(){
		estado = new String[this.size][this.size];
		for(int i = 0; i < this.size; i++){
			for(int j = 0; j < this.size; j++){
				this.estado[i][j] = Constants.EMPTY_SLOT;
			}
		}
	}	
	
	//GETTERS AND SETTERS
	public String[][] getEstado() {
		return estado;
	}

	public void setEstado(String[][] estado) {
		this.estado = estado;
	}
	
	public boolean verificarVitoria(Tabuleiro t, Player p)
	{
		Long valor = 0L;
		
		valor = FuncaoUtilidade.calculaValorSequenciaQuintupla(t, p.getValorPeca());
		if(valor > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	
}
