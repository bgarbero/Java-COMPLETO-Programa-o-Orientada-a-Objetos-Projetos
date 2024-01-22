package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();

		String[] name = new String[n];
		int[] age = new int[n];
		String old = null;
		int controllerAge = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			sc.nextLine();
			
			if(controllerAge < age[i]) {
				controllerAge = age[i];
				old = name[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: "+ old);

		sc.close();
	}

}
