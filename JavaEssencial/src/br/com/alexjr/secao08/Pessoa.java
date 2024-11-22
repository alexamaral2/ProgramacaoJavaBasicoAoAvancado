package br.com.alexjr.secao08;

//Classes

//Atributos

//Metodos
/*
 * Sempre, um construtor vazio tem a seguinte forma:
 * public NomeDaClasse(){}
 */
public class Pessoa {

	String nome, email;
	int anoNascimento;

	// Construtor vazio
	public Pessoa() {
	}

	// construtor com parâmetros
	public Pessoa(String nome, String email, int anoNascimento) {
		this.nome = nome;
		this.email = email;
		this.anoNascimento = anoNascimento;
	}
	
	void imprimeInformacoes() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Email: " + this.email);
		System.out.println("Ano de Nascimento: " + this.anoNascimento);
	}
}
