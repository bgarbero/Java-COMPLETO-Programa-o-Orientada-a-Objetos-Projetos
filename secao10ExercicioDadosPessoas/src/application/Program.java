package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		People[] people = new People[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Altura da "+(i+1)+"a pessoa: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Genero da "+(i+1)+"a pessoa: ");
			char sexo = sc.next().charAt(0);
			sc.nextLine();
			
			people[i] = new People(altura, sexo);
		}
		
		double menorAltura = people[0].getAltura();
		double maiorAltura = people[0].getAltura();
		double mediaAlturaFeminina;
		int totalDoSexoFeminino = 0;
		double somaDasAlturasFemininas = 0;
		int numeroDeHomens = 0;
		
		for (int i = 0; i < people.length; i++) {
			
			if (people[i].getAltura() > maiorAltura) {
				maiorAltura = people[i].getAltura(); 
				
			} else if (people[i].getAltura() < menorAltura) {
				menorAltura = people[i].getAltura();
				
			} else if (people[i].getSexo() == 'F') {
				totalDoSexoFeminino += 1;
				somaDasAlturasFemininas += people[i].getAltura();
			}
			
			if (people[i].getSexo() == 'M') {
					numeroDeHomens += 1;
			}
		}
		
		mediaAlturaFeminina = somaDasAlturasFemininas / totalDoSexoFeminino;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", mediaAlturaFeminina);
		System.out.printf("Numero de homens = %d%n", numeroDeHomens);

		sc.close();
	}

}
