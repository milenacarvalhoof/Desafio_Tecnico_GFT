package br.com.gft.desafioTecnico.desafio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Gato daphne = new Gato("Daphne", 20);
		Gato artemis = new Gato("Artemis", 3);
		Cachorro xereta = new Cachorro("Xereta", 10);
		Gato victor_hugo = new Gato("Victor Hugo", 5);
		
		double soma = daphne.quantidadeDeRacao() + artemis.quantidadeDeRacao() + xereta.quantidadeDeRacao() + victor_hugo.quantidadeDeRacao();
		System.out.println("Quantidade de ração consumida por todos = " + soma + "g");
		
		ler.close();
	}
	
}
