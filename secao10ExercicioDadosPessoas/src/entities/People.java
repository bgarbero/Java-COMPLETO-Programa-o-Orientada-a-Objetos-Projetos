package entities;

public class People {
	private double altura;
	private char sexo;
	
	public People(double altura, char sexo) {
		this.altura = altura;
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
