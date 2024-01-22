package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f", media);
		System.out.println();
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i =0; i<vect.length;i++) {
			if (vect[i]<media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
