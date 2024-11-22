package br.com.alexjr.secao08;

//Classes

/*
 * O nome das classes inicia com letra maiúscula;
 * O nome não deve conter: Acentuação, caracteres especiais, espaço
 * Nas classes Java, não existe a implementação da função main()
 * Toda Classe Java possui a seguinte form:
 * - o nome da classe Java deve ser o mesmo nome do arquivo Java.
 * Tudo que estiver dentro das "chaves" faz parte da classe.
 * public class NomeDaClasse {
 * 
 * }
 */

//Atributos
/*
 * São as caracteristicas da classe/molde/modelo de dados;
 * Podemos entender atributos como variáveis da classe;
 * Uma outra forma de nomenclatura para os atributos são estados;
 * Atributos são nomeados em letras minúsculas, sem espaços, sem 
 * caracteres especiais, sem acentuação.
 */

//Metodos
/*
 * Podemos entender os métodos como a ação que é realizada por um objeto da classe:
 * Podemos entender também que os métodos são comportamentos dos objetos da classe;
 * 
 * Mesmo requisitos para função
 */
public class Produto {

	String nome;
	float preco;
	float desconto;

	// Metodo para aumentar o preco do projeto em 10
	void aumentarPreco(float valor) {
		this.preco = this.preco + valor;
	}
}
