package br.com.ftec.poo.exercicios;

import java.util.Collections;
import java.util.LinkedList;

public class ExecutaOperacoesLinkedList {

	public static void main(String[] args) {
		LinkedList<String> nomes = new LinkedList<String>();
		nomes.add("Carolina");
		nomes.add("Pedro");
		nomes.add("Felipe");
		nomes.add("K�vin");
		
		System.out.println("Iterar sobre a lista de nomes: ");
		for(String nome: nomes){
			System.out.println(nome);
		}
		System.out.println("-------------------------------");
		
		System.out.println("Lista de nomes: ");
		System.out.println(nomes);
		System.out.println("-------------------------------");
		
		System.out.println("Adicionar nome Julia depois de pedro: ");
		nomes.add(2, "Julia");
		System.out.println(nomes);
		System.out.println("-------------------------------");
		
		System.out.println("Adicionar nome Ana na primeira posi��o e Eduardo na ultima: ");
		nomes.addFirst("Ana");
		nomes.addLast("Eduardo");
		System.out.println(nomes);
		System.out.println("-------------------------------");
		
		System.out.println("Mostrar apenas o primeiro e ultimo nome da lista: ");
		System.out.println("Primeiro nome: " +nomes.getFirst());
		System.out.println("Primeiro nome: " +nomes.getLast());
		System.out.println("-------------------------------");
		
		System.out.println("Mostrar nomes e suas posi��es: ");
		for(int posicao = 0; posicao <nomes.size(); posicao++){
			System.out.println("Nome na posi��o: "+posicao+ " � " +nomes.get(posicao));
		}
		System.out.println("-------------------------------");
		
		System.out.println("Remover o nome Julia da lista: ");
		nomes.remove(3);
		System.out.println(nomes);
		System.out.println("-------------------------------");
		
		System.out.println("Trocar nomes Carolina e K�vin de posi��o : ");
		Collections.swap(nomes, 1, 5);
		System.out.println(nomes);
		System.out.println("-------------------------------");

	}
}
