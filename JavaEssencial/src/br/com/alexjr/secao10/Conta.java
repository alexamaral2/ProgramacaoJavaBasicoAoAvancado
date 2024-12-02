package br.com.alexjr.secao10;

public class Conta {
    private int numero;
    private float saldo;
    private float limite;
    private Cliente cliente;

    public Conta(int numero, float saldo, float limite, Cliente cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.cliente = cliente;
    }

    public void sacar(float valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else if (valor <= (this.saldo + this.limite)) {
            float excedente = valor - this.saldo;
            this.saldo = 0;
            this.limite -= excedente;
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
}
