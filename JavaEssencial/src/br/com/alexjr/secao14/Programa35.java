package br.com.alexjr.secao14;
//Métodos estáticos

/*
 * Um método estatico, não depende de uma instância da classe 
 * para ser utilizado.
 * 
 * Pode-se utilizar conforme
 * 
 * NomeDaClasse.metodo();
 */
public class Programa35 {

	public static void main(String[] args) {
		Conta c1 = new Conta("Meu Cliente");
		System.out.println("Numero da Conta: " + c1.getNumero());
		System.out.println("Cliente: " + c1.getCliente());
		System.out.println("A próxima conta será: " + Conta.proximaConta());
	}
}
