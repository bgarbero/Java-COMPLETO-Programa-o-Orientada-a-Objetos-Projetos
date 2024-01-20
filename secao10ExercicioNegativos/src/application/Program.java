package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vect = new int[10];

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		sc.nextLine();
		System.out.println("NUMEROS NEGATIVOS:");
		for (int i = 0; i < n; i++) {
			if (vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
