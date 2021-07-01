package br.com.ftec.poo.trabalhogb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteComparable {

	public static void main(String[] args) {
	
		List<Clube> tabela = new ArrayList<Clube>();
		
		tabela.add(new Clube(68, 20, 19, "Atl. Mineiro"));
		tabela.add(new Clube(71, 21, 20, "Flamengo"));
		tabela.add(new Clube(70, 20, 26, "Inter"));
		tabela.add(new Clube(66, 18, 18, "S�o Paulo"));
		
		System.out.println("Clubes antes da ordena��o");
		for(Clube clube : tabela){
			System.out.println(clube.getNome() + " = " + clube.getPontos() + ", " +
					clube.getVitorias() + ", " + clube.getSaldoDeGols());
		}
		System.out.println("\n===============================");
		
		Collections.sort(tabela);
		
		System.out.println("Clubes depois da ordena��o");
		for(Clube clube : tabela){
			System.out.println(clube.getNome() + " = " + clube.getPontos() + ", " +
					clube.getVitorias() + ", " + clube.getSaldoDeGols());
		}
		System.out.println("\n===============================");
	}

}
