package br.com.gft.desafioTecnico.desafio1;

public class Cachorro extends Animal {
	
	double gramas;
	
	public Cachorro(String nome, double peso) {
		super(nome, peso);
	}
	
	@Override
	public String som() {
		return "auau";
	}
	@Override
	public double quantidadeDeRacao() {
		if (peso <= 4) {
			gramas = 40 * peso;
		} else if (peso <= 12) {
			gramas = 45 * peso;
		} else {
			gramas = 55 * peso;
		}
		return gramas;
	}
	
}
