package br.com.alexjr.secao11;

public class Program28 {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro da Silva", 1987, "pedro@gmail.com");
		System.out.println(p1.toString());
		System.out.println(p1.getNome());
		System.out.println("\n");
		
		Aluno a1 = new Aluno("Vanessa da Silva", 2001, "123456", "vanessa@gmail.com");
		System.out.println(a1.toString());
		System.out.println(a1.getNome());
		System.out.println("\n");
		
		Professor prof1 = new Professor("Pedro da Silva", 1976, "ABC987", "pedro@gmail.com");
		System.out.println(prof1.toString());
		System.out.println(prof1.getNome());
		System.out.println("\n");
		
	}

}
