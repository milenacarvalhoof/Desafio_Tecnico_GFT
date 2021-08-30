package br.com.gft.desafioTecnico.desafio1;

public abstract class Animal {
	
	String nome;
	double peso;
	
	public Animal(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public abstract String som();
	
	public abstract double quantidadeDeRacao();
	
}
