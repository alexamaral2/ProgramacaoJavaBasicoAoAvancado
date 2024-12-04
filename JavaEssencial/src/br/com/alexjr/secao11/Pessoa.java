package br.com.alexjr.secao11;

/*
 * Classe Base
 * Classe mãe
 * Classe pai
 * Super Classe
 * Classe Genérica
 */

//Agora como Classe Abstrata
/*
 * Desta forma, impossibilitamos a criação de objetos dessa classe
 * Uma classe abstrata pode ter:
 * Atributos
 * Metodos
 * Metodos abstratos
 * 
 * MEtodos abstratos:
 * São Metodos, que não possuem implementação, possuem apenas
 * declaração, e obrigatoriamente as classes que herdarem desta
 * classe com metodos abstrato, precisa implementar estes métodos.
 */
public abstract class Pessoa {

	private String nome;
	private int anoNascimento;
	private String email;

	public Pessoa() {
	}

	public Pessoa(String nome, int anoNascimento, String email) {
		this.nome = nome;
		this.anoNascimento = anoNascimento;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nAno Nascimento: " + this.anoNascimento;
	}

	public void mensagem() {
		System.out.println("Esta é a minha mensagem");
	}

	public void mensagem(String msg) {
		System.out.println(msg);
	}

	// Declaração de um método abstrato
	public abstract void outraMensagem(String texto);

}
