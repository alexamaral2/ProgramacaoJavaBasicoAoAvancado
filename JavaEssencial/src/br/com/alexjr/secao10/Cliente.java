package br.com.alexjr.secao10;

public class Cliente implements Comparable<Object> {
	
	private Integer idade;
	private String nome;
	private String endereco;
	
	public Cliente(Integer idade, String nome, String endereco) {
		this.idade = idade;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.nome;
	}

	@Override
	public int compareTo(Object outro) {
		 Cliente outroCliente = (Cliente) outro;
		 return this.idade.compareTo(outroCliente.idade);
	}
	
	
}
