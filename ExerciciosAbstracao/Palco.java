package br.com.ftec.poo.exercicios.abstracao;

public class Palco {
	
	private Ator ator = new AtorCom�dia();
	
	public void alterar(){
		ator = new AtorDrama();
	}
	
	public void atuarPalco(){
		ator.atuar();
	}
}
