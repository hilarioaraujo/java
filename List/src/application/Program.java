package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// Adiciona um elemento num nó especifico
		list.add(2, "Marco");

		System.out.println(list.size());

		// remove um nó apartir da comparação da String
		list.remove("Anna");

		// remove um nó apartir de um nó
		list.remove(1);

		for (String x : list) {
			System.out.println(x);
		}

		// Procurar uma string na lista
		System.out.println("Index of Bob: " + list.lastIndexOf("Bob"));

		System.out.println("------------------");

		// eliminar todos os nós que tenham uma String a começar com letra M
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		System.out.println("--------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("--------------");
		// Encontrar 1º elemento que comece com A
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
