package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;

	public double area() {//essa função não recebeu parâmetros pois ela não precisa de dados além dos que já estão contidos na classe
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
