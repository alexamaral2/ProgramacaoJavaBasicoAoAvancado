package br.com.alexjr.secao08;

//Construtor

/*
 * O Construtor de uma classe sempre tem o mesmo nome da classe;
 * Por padrão, a JVM - Java Virtual Machine, cria em tempo de execução,
 * um construtor padrão;
 * Podemos ter mais de um construtor na classe;
 */
public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); // (Método) Construtor
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.anoNascimento = 1986;
		
		pessoa1.imprimeInformacoes();
		System.out.println();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina@gmail.com", 1976);
		pessoa2.imprimeInformacoes();	
	}

}
