package br.com.alexjr.secao13;
/*
 * Uma interface pode conter:
 * 	- Constantes;
 * 	- Metodos abstratos;
 * 
 * 
 * 	Interface para servir de contrato para produtos eletrônicos. Todo
 * 	produto eletrônico que implementar esta interface. OBRIGATORIAMENTE
 * 	deverão implementar os métodos abstratos.
 */
public interface IEletronico {
	
	public String marca = "Geek";
	
	public void ligar();
	
	public void desligar();
}
