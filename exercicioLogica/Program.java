import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double precoMetroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * precoMetroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.println();
		System.out.printf("PRECO = %.2f", preco);
		
		sc.close();
	}

}
