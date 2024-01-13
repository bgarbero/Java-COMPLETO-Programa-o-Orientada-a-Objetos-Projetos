package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Calculator calc = new Calculator(); //para usar os métodos não estáticos da classe calculator tivemos que instanciar o objeto calculator

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calc.circumference(radius); //atribuindo a variável c a funcção circumference() recebendo radius como parâmetro
		double v = calc.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}
}