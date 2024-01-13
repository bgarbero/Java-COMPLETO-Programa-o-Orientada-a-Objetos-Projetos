package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double PI = 3.14159; //final quer dizer que é uma constante
	//O padrão de nomes de constantes é tudo maiúsculo. Se for mais de uma palavra usamos o underline para separar
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = circumference(radius); //atribuindo a variável c a funcção circumference() recebendo radius como parâmetro
		double v = volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
	}
	//criando a função
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;
	}

}
// não é possível chamar um método que não é static dentro de um que é static