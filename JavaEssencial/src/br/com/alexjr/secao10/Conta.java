package br.com.alexjr.secao10;

public class Conta {
	int numero;
	float saldo;
	float limite;
	Cliente cliente;

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo + limite;
		this.limite = limite;
		this.cliente = cliente;
	}

	void sacar(float valor) {
		this.saldo = this.saldo - valor;
	}

	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
}
