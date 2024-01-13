package application;

public class BubbleSort {

	public static void main(String[] args) {
		int vetor[] = { 3, 6, 2, 1, 8, 4 };
		int aux;
		boolean controle;

		for (int i = 0; i < vetor.length; ++i) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); ++j) {
				if (vetor[j] > vetor[j + 1]) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
			}
			if (controle) {
				break;
			}
		}
		for (int i = 0; i < vetor.length; ++i) {
			System.out.print(vetor[i] + " ");
		}
	}
}

// com o bubble sort vamos percorrer o vetor de dois em dois.
// meu primeiro membro é maior que o segundo? Se sim, inverte-se a posição. Se não, mantém.
// compara-se 3 e 6, 6 e 2, 2 e 1...
// dessa forma empurramos os números maiores para o final do vetor e os menores para o início.
// caso queira fazer em ordem decrescente, basta trocar o sinal de > por < na linha 13.