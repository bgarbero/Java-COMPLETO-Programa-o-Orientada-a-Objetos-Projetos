package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] nome = new String[n];
		double[] primeiraNota = new double[n];
		double[] segundaNota = new double[n];
		String[] aprovados = new String[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do "+(i+1)+"o aluno:");
			nome[i] = sc.nextLine();
			primeiraNota[i] = sc.nextDouble();
			sc.nextLine();
			segundaNota[i] = sc.nextDouble();
			sc.nextLine();
			
			if((primeiraNota[i] + segundaNota[i]) / 2 >= 6.0) {
				aprovados[i] = nome[i];
			}
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < n; i++) {
			if (aprovados[i] != null) {
				System.out.println(aprovados[i]);
			}
		}

		sc.close();
	}

}
