package br.com.gft.desafioTecnico.desafio1;

public class Gato extends Animal {
	
	double gramas;
	
	public Gato(String nome, double peso) {
		super(nome, peso);
	}
	@Override
	public String som() {
		return "miau";
	}
	
	@Override
	public double quantidadeDeRacao() {
		if (peso <= 3) {
			gramas = 10 * peso;
		} else {
			gramas = 13 * peso;
		}
		return gramas;
	}

}
