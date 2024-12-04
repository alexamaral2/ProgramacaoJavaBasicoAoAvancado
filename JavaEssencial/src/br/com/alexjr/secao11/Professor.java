package br.com.alexjr.secao11;

public class Professor extends Pessoa {

	private String matricula;

	public Professor(String nome, int anoNascimento, String matricula, String email) {
		super(nome, anoNascimento, email);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		return super.toString() + "\nMatricula: " + this.matricula;
	}
	
	@Override
	public String getNome() {
		return "Professor: \n"+ super.getNome();
	}

	@Override
	public void outraMensagem(String texto) {
		System.out.println(texto);
	}
}
