package br.com.gft.desafioTecnico.desafio3;

import java.util.Scanner;

public class Multiplicando {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Multiplicando:");
		int n = ler.nextInt();
		
		System.out.print("Inicio do Intervalo:");
		int inicio = ler.nextInt();
		System.out.print("Fim do Intervalo:");
		int fim = ler.nextInt();
		
		if (n < 0 || n > 1500) {
			System.out.println("ERRO: O Multiplicando deve ser um numero positivo abaixo de 1500");
		} else if (inicio < 0 || inicio > 1500) {
			System.out.println("ERRO: O Inicio do intervalo deve ser um numero positivo abaixo de 1500");
		} else if (fim < 0 || fim > 1500) {
			System.out.println("ERRO: O Fim do intervalo deve ser um numero positivo abaixo de 1500");
		} else if (fim < inicio) {
			System.out.println("ERRO: O Fim do intervalo deve ser maior que o inicio");
		} else if (fim - inicio > 9) {
			System.out.println("ERRO: O intervalo entre o inicio e fim deve ser menor ou igual a 10");
		} else {
			for (int i = inicio; i <= fim; i++) {
				int calculo = n * i;
				System.out.println(n + " x " + i + " = " + calculo);
			}
		}
		
		
		ler.close();
	}
}
