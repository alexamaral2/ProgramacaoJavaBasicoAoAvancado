package br.com.alexjr.secao20;
/**
 * Classe que representa uma célula (Container) onde
 * teremos o objeto (valor) e uma celula que será a ligação para
 * o próximo.
 * 
 * @author alex-jr
 */
public class Celula {

	private Object elemento;
	private Celula proximo;
	
	public Celula(Object elemento, Celula proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
	}

	public Object getElemento() {
		return elemento;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public Celula getProximo() {
		return proximo;
	}

	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
	
}
