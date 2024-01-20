package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluguel[] vect = new Aluguel[10]; //10 porque são 10 quartos apenas
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) { //colocamos i < n para não termos que preencher todos os quartos
			sc.nextLine();
			System.out.println();
			
			System.out.println("Rent #" + (i + 1) + ":");
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			Integer room = sc.nextInt();
			
			vect[room] = new Aluguel(name, email);// vect[room] para colocar o inquilino no quarto correspondente a posição no vetor
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null ) {//o laço for vai passar por todas as posições do vetor e if só printará na tela aqueles que não são null
				System.out.println(i + ": " + vect[i].getName() + ", " + vect[i].getEmail());
			}
		}

		sc.close();
	}

}


