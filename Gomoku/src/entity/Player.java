package entity;

public class Player {

	private String name;
	
	private String valorPeca;

	public Player(String name, String valorPeca){
		this.name = name;
		this.valorPeca = valorPeca;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValorPeca() {
		return valorPeca;
	}

	public void setValorPeca(String valorPeca) {
		this.valorPeca = valorPeca;
	}	
	
}
