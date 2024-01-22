package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		int[] vect = new int[n];
		int somaPares = 0;
		int controller = 0;

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				somaPares += vect[i];
				controller += 1;
			}
		}
		
		double media = somaPares / controller;
		
		if (media != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", media);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}

		sc.close();
	}

}
