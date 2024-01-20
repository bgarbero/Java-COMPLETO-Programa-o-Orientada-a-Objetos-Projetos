package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Products[] vect = new Products[n];
		/*
		 * Acima instanciamos o objeto vect da classe Products que é acompanhada do []
		 * por ser um vetor nesse caso.
		 */

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}

		double sum = 0.0;

		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);

		sc.close();
	}

}
