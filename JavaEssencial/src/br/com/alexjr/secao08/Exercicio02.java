package br.com.alexjr.secao08;

public class Exercicio02 {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		
		Contato contato1 = new Contato();
		contato1.setNome("Felicity Jones");
		contato1.setEmail("felicity@gmail.com");
		contato1.setTelefone("555-6789");
		
		Contato contato2 = new Contato();
		contato2.setNome("Angelina Jolie");
		contato2.setEmail("angelina@gmail.com");
		contato2.setTelefone("555-4325");
		
		Contato contato3 = new Contato();
		contato3.setNome("Ray Sychev");
		contato3.setEmail("ray@gmail.com");
		contato3.setTelefone("555-7699");
		
		agenda.armazenarContato(contato1);
		agenda.armazenarContato(contato2);
		agenda.armazenarContato(contato3);
		
		agenda.imprimeAgenda();
		
		agenda.imprimeContato(2);
		
		System.out.println(agenda.buscaContato("Angelina Jolie"));
		
		agenda.removeContato(contato3);
		
		agenda.imprimeAgenda();
	}

}
