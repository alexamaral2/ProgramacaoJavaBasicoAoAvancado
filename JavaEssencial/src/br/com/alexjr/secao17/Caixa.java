package br.com.alexjr.secao17;

import br.com.alexjr.secao10.Conta;

//Caixa de Objetos genéricos
public class Caixa {

	private Object[] objetos;
	private int posicaoLivre;

	public Caixa() {
		objetos = new Object[100]; // até 100 objetos 0..99
		posicaoLivre = 0;
	}

	public void adicionar(Object nova) {
		this.objetos[this.posicaoLivre] = nova;
		this.posicaoLivre++;
	}

	public Object pegar(int posicao) {
		return this.objetos[posicao];
	}
}
