package br.com.alexjr.secao20;

import java.util.LinkedList;
import java.util.List;

public class Conjunto {

	private LinkedList<LinkedList<String>> tabela = new LinkedList<LinkedList<String>>();

	public Conjunto() {
		for (int i = 0; i < 26; i++) {
			tabela.add(new LinkedList<String>());
		}
	}

	private int calculaIndicie(String nome) {
		return nome.toLowerCase().charAt(0) % 26;
	}

	public void adiciona(String nome) {
		if(!contem(nome)) {
			int indice = calculaIndicie(nome);
			List<String> lista = tabela.get(indice);
			lista.add(nome);
		}
	}

	public boolean contem(String nome) {
		int indice = calculaIndicie(nome);
		return tabela.get(indice).contains(nome);
	}
	
	public void remove(String nome) {
		if(contem(nome)) {
			int indice = calculaIndicie(nome);
			List<String> lista = tabela.get(indice);
			lista.remove(nome);
		}
	}
	
	@Override
	public String toString() {
		return tabela.toString();
	}
}
