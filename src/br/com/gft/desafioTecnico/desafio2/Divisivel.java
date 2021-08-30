package br.com.gft.desafioTecnico.desafio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Divisivel {
	public static void main(String[] args) {
		int numero;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		numero = ler.nextInt();
		
		verificarNumero(numero);
		
		ler.close();
	}

	private static void verificarNumero(int numero) {
		List<Integer> lista = new ArrayList<>();
		if (numero % 3 == 0) {
			lista.add(3);
		}
		if (numero % 6 == 0) {
			lista.add(6);
		}
		if (numero % 7 == 0) {
			lista.add(7);
		}
		
		lista.forEach(i -> System.out.println("Divisível por " + i));
		
	}

}
