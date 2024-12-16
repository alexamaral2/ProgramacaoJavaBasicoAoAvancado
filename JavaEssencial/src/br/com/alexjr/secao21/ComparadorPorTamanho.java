package br.com.alexjr.secao21;

import java.util.Comparator;


/*
 * A gente está criando nosso proprio comparador de objetos (String)
 * para que seja possivel, desta forma, ordenar a String pelo seu tamanho
 * ao invés de ordem alfabética.
 * 
 * 1- A string1 é menor que a string2 -> retornamos -1
 * 2- A string1 é maior que a string2  -> retornamos 1
 * 3- A string1 tem o mesmo tamanho da string2 -> retonamos 0
 */
public class ComparadorPorTamanho implements Comparator{

	@Override
	public int compare(Object s1, Object s2) {
	    String str1 = (String) s1;
	    String str2 = (String) s2;
	    
	    return Integer.compare(str1.length(), str2.length());
	}


}
