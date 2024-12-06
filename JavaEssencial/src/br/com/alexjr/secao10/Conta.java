package br.com.alexjr.secao10;

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;

	public Conta() {
	}

	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;
	}

	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else if (valor <= (this.saldo + this.limite)) {
			float excedente = valor - this.saldo;
			if (excedente < 0) {
				this.saldo = 0;
			}
			excedente = this.limite + excedente;
			this.limite = excedente;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(float valor) {
		this.saldo += valor;
	}

	public float getSaldo() {
		return this.saldo + this.limite;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "O saldo da conta é " + this.getSaldo();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Conta)) {
			return false;
		} else {
			Conta verificar = (Conta) obj; // Cast
			return verificar.getSaldo() == this.getSaldo();
		}
	}
}
