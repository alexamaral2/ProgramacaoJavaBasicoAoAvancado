package br.com.alexjr.secao12;

import br.com.alexjr.secao11.Pessoa;
import br.com.alexjr.secao11.Aluno;

//Classes Abstratas
/*
 *	É um recurso que proporciona um bloqueio na criação de objetos:
 *	Não conseguimos instanciar objetos de uma classe abstrata
 */
public class Programa31 {

	public static void main(String[] args) {
		Pessoa maria = new Aluno("Maria da Silva", 1999, "maria@gmail.com", "123456");

		System.out.println(maria);
		
		maria.outraMensagem("Meu nome é " + maria.getNome());
	}
}
