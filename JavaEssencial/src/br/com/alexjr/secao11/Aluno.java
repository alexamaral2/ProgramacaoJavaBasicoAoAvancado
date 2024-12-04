package br.com.alexjr.secao11;

/*
 * Beneficios da Herança
 * Evita a repetição de código;
 * Facilita a manutenção do código
 */

/*
 * Classe Especifica
 * Sub-classe
 * Classe filha
 */

/*
 *	Aluno é uma Pessoa 
 *	Quando uma classe herda de outra classe ela ganha:
 *	Todos os atributos e metodos da Classe herdada
 */
public class Aluno extends Pessoa {
	private String ra;

	public Aluno(String nome, int anoNascimento, String ra, String email) {
		super(nome, anoNascimento, email);
		this.ra = ra;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	
	@Override
	public String getNome() {
		return "Aluno: \n"+ super.getNome();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nR.A.:"  + this.ra;
	}

	@Override
	public void outraMensagem(String texto) {
		System.out.println(texto);
	}

}
