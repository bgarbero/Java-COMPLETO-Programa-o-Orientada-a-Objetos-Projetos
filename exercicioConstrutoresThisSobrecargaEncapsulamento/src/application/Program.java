package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta; //Entender isso

		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String titularDaConta = sc.nextLine();

		System.out.print("Is there na initial deposit (y/n)? ");
		char deposita = sc.next().charAt(0);

		if (deposita == 'y') {
			System.out.println("Enter initial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroDaConta, titularDaConta, depositoInicial);
		} else {
			conta = new Conta(numeroDaConta, titularDaConta);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a deposit value: ");
		double valor = sc.nextDouble();
		conta.deposito(valor);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		//https://github.com/acenelio/encapsulation1-java/tree/master/src
		

		sc.close();
	}

}
