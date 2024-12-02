package br.com.alexjr.secao10;

//Encapsulamento
//Capsula
public class Programa25 {

    public static void main(String[] args) {
        Cliente joao = new Cliente("João da Silva", "Rua da paz, 45");
        Cliente maria = new Cliente("Maria da Silva", "Rua da paz, 45");

        Conta contaJoao = new Conta(1, 100.0f, 200.0f, joao);
        Conta contaMaria = new Conta(2, 300.0f, 500.0f, maria);

        System.out.println("Saldo do João (Antes do Saque): " + contaJoao.getSaldo());
        System.out.println("Saldo da Maria: " + contaMaria.getSaldo());

        contaJoao.sacar(150);
        System.out.println("Saldo do João (Depois do Saque): " + contaJoao.getSaldo());
    }
}

