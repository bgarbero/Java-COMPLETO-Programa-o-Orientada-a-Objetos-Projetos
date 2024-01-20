package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0;

		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + vect[i]);
			soma += vect[i];
		}

		System.out.println();
		double media = soma / vect.length;
		System.out.println("SOMA = " + soma);
		System.out.println("MEDIA = " + media);

		sc.close();
	}

}
