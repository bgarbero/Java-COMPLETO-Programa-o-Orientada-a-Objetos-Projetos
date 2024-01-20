package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		Pessoa[] pessoa = new Pessoa[n];

		for (int i = 0; i < pessoa.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa: ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.println("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			System.out.println("Altura: ");
			double altura = sc.nextDouble();

			pessoa[i] = new Pessoa(name, idade, altura);
		}

		double soma = 0;

		for (int i = 0; i < pessoa.length; i++) {
			soma += pessoa[i].getAltura();
		}

		int controller = 0;

		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				controller += 1;
			}
		}

		double percentual = (100 * controller) / pessoa.length;

		double media = soma / pessoa.length;
		System.out.printf("Altura média: %.2f", media);
		System.out.println();
		System.out.println("Pessoas com menos de 16 anos: "+ percentual +"%");
		for (int i = 0; i < pessoa.length; i++) {
			if (pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getName());
			}
		}

		sc.close();
	}

}
