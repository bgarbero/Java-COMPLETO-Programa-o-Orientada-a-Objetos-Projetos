package problemaExemplo1Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		/*
		 * para instanciarmos o vetor primeiro colocamos o tipo e logo após colocamos
		 * [], nomeamos o vetor e atribuímos com new e o tipo dos elementos do vetor e,
		 * entre colchetes o tamanho do vetor, que no caso é n.
		 */
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f", avg);

		sc.close();
	}

}
