package br.com.gft.desafioTecnico.desafio4;

import java.util.Scanner;

public class ControleDeFuncionarios {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Controle de Funcionários");
		
		int cont = 1;
		int starter = 0;
		int junior = 0;
		int senior = 0;
		
		while (cont <= 5) {
			System.out.print("Informe o nome da " + cont + "º" + " pessoa: ");
			String nome = ler.nextLine();
			System.out.print("Informe o cargo da " +  cont + "º" + " pessoa: (Starter, Junior ou Sênior): ");
			String cargo = ler.nextLine();
			Pessoa pessoa = new Pessoa(nome, cargo);
			
			if (pessoa.getCargo().equalsIgnoreCase("Starter")) {
				starter++;
			} else if (pessoa.getCargo().equalsIgnoreCase("Junior")) {
				junior++;
			} else {
				senior++;
			}
			cont++;
		}
		
		System.out.println();
		System.out.println("Total de pessoas");
		System.out.println("Starter: " + starter);
		System.out.println("Junior: " + junior);
		System.out.println("Sênior: " + senior);
		
		ler.close();
	}

}
