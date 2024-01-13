package entities;

public class Conta {

	private int numeroDaConta;
	public String titularDaConta;
	private double saldo;
	
	public Conta(int numeroDaConta, String titularDaConta) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
	}
	
	//Da correção
	public Conta(int numeroDaConta, String titularDaConta, double depositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.titularDaConta = titularDaConta;
		deposito(depositoInicial);
	}
	//
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getTitularDaConta() {
		return titularDaConta;
	}

	public void setTitularDaConta(String titularDaConta) {
		this.titularDaConta = titularDaConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void saca(double valor) {
		this.saldo -= valor + 5.0;
	}
	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public String toString() {
		return "Account"
				+ numeroDaConta
				+ ", Holder: "
				+ titularDaConta
				+ ", Balance: $ "
				+ String.format("%.2f", saldo);
	}
	
}
