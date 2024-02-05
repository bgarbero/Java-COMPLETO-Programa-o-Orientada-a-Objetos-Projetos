package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// List x = new List(); -> não conseguimos instanciar o tipo list pois ele é uma
		// interface
		// por conta disso vamos precisar de uma classe para instarciarmos.

		// interface<tipo> nomeDaLista; Obs.: a lista não aceita tipo primitivos. Por
		// conta disso devemos utilizar as wrapper class.
		// após o sinal de atribuição, instanciamos nossa lista com a classe
		// ArrayList<>().

		List<String> list = new ArrayList<>();

		// após a instanciação, vamos adicionar alguns elementos a lista

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// vamos inserir um novo elemento na posição 2 (depois do Alex)

		list.add(2, "Marco");

		// agora vamos ver o tamanho de nossa lista

		System.out.println(list.size());

		// para verificarmos se a lista está correta, vamos percorrê-la com for each

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		// agora vamos remover a Anna da lista

		// list.remove("Anna");

		// agora vamos remover quem está na posição 1

		// list.remove(1);

		// vamos remover todos que começam com a letra M através de um predicado
		// remova se(todo String x -> charAt começa com 'M'. Essa é a função lambda ou
		// predicado

		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		// agora vamos encontrar a posição de um elemento

		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		// quando o indexOf não encontra o elemento ele retorna -1

		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		System.out.println("-----------------------------------");

		// agora queremos deixar na lista todo mundo que começa com 'A'
		// vamos criar uma nova lista convertendo a antiga para stream
		// depois fazemos a condição lambda desejada
		// e depois voltamos ele para lista com o collect.

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------------------");

		// encontrando um elemento da lista que atenda um certo predicado
		// queremos o primeiro elemento que comece com uma determinada letra
		// o findFirst vai procurar o primeiro elemento da lista que atenda o predicado
		// caso esse elemento não exista, ele vai me retornar null

		String nameA = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);

		System.out.println(nameA);

		String nameJ = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);

		System.out.println(nameJ);
	}

}
