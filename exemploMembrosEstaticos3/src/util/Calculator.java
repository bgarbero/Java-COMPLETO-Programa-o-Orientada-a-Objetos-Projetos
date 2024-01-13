package util;

public class Calculator {

	public static final double PI = 3.14159; // final quer dizer que é uma constante
	// O padrão de nomes de constantes é tudo maiúsculo. Se for mais de uma palavra
	// usamos o underline para separar

	// criando a função
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3.0;

	}
}