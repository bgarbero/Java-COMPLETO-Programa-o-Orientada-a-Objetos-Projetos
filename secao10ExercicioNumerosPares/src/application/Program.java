package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int soma = 0;
		
		System.out.println("NUMEROS PARES:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				soma += 1;
				System.out.print(numeros[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+ soma);
		
		sc.close();
	}

}
