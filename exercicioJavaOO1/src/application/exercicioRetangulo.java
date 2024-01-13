package application;

import java.util.Locale;
import java.util.Scanner;

import entities.retangulo;

public class exercicioRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		retangulo retangulo = new retangulo();
		
		System.out.println("Enter rectangle width and height:");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		double area = retangulo.area();
		double perimeter = retangulo.perimeter();
		double diagonal = retangulo.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		sc.close();
	}

}
