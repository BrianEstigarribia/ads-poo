package br.com.ftec.poo.exercicios;

import java.util.ArrayList;
import java.util.List;

public class ExecutaOperacoesArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Preto");
		cores.add("Cinza");
		cores.add("Roxo");
		
		System.out.println("Mostrando cores adicionadas: \n"+ cores);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Iterar sobre os elementos e mostrar todos em CAIXA ALTA:");
		for(String caixaAlta: cores){
			System.out.println(caixaAlta.toUpperCase());
		}
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Adicionando elementos na primeira e penultima posi��o do Arraylist: ");
		cores.add(0,"Rosa");
		cores.add(5,"Laranja");
		System.out.println(cores);
		System.out.println("--------------------------------------------------------");
		
		String elemento = cores.get(1);
		System.out.println("Mostrando elemento selecionado(segundo elemento): "+elemento);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Atualizando terceiro elemento do ArrayList para a cor Tuquesa: ");
		cores.set(2, "Turquesa");
		System.out.println(cores);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Remover elemento Laranja do ArrayList: ");
		cores.remove(5);
		System.out.println(cores);
		System.out.println("--------------------------------------------------------");
		
		System.out.println("Verificar se o elemento Cinza est� no ArrayList: ");
		if(cores.contains("Cinza")){
			System.out.println("Cinza est� no ArrayList de cores!");
		}else{
			System.out.println("Cinza n�o est� no Arraylist de cores!");
		}
		
		System.out.println("Verificar se o elemento Verde est� no ArrayList: ");
		if(cores.contains("Verde")){
			System.out.println("Verde est� no ArrayList de cores!");
		}else{
			System.out.println("Verde n�o est� no Arraylist de cores!");
		}
		System.out.println("--------------------------------------------------------");
		
		
	}
}
