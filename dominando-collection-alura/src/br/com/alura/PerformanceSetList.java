package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class PerformanceSetList {

	public static void main(String[] args) {

//		Collection<Integer> numeros = new ArrayList<Integer>(); //Tempo gasto: 207077
		Collection<Integer> numeros = new HashSet<Integer>(); //Tempo gasto: 96
		long inicio = System.currentTimeMillis();

		for (int i = 1; i <= 500000; i++) {
			numeros.add(i);
		}

		for (Integer numero : numeros) {
			numeros.contains(numero);
		}

		long fim = System.currentTimeMillis();
		long tempoDeExecucao = fim - inicio;

		System.out.println("Tempo gasto: " + tempoDeExecucao);
	}

}
