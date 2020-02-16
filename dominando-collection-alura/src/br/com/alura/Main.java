package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
//		byte aulaTempo= 20;
//		byte aula1Tempo= 15;
//		byte aula2Tempo= 100;
//		List<Aula> aulas= new ArrayList<>();
//		aulas.add(new Aula("Java 8", aulaTempo));
//		aulas.add(new Aula("HTML", aula1Tempo));
//		aulas.add(new Aula("CSS", aula2Tempo));
//		
//		System.out.println(aulas);
//		Collections.sort(aulas);
//		System.out.println(aulas);
//		
//		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
//		System.out.println(aulas);
//		
//		aulas.sort(Comparator.comparing(Aula::getTempo));
//		System.out.println(aulas);

//		relacionandoCursoAula();
//		usingSet();
//		relacionamentoCursoAluno();
//		equalsAndHashCode();
//		iteratorAndSet() ;
		map();

	}

	public static Curso getCurso() {
		Curso curso = new Curso("BSI", "Paulo Silveira");
		curso.add(new Aula("Algoritmos", new Byte("10")));
		curso.add(new Aula("POO", new Byte("20")));
		curso.matricular(new Aluno("Douglas", 11223));
		curso.matricular(new Aluno("Inez", 2332));
		return curso;
	}

	public static void relacionandoCursoAula() {
		Curso curso = getCurso();
		System.out.println(curso.getAulas());
//		List<Aula> aulas = curso.getAulas();
//		aulas.add(new Aula("Algoritmos", new Byte("10"))); java.lang.UnsupportedOperationException list virou imutável
//		Fazem referencia p mesmo objeto em memoria

//		Como haverá uma mudança na posição dos elementos e a list é imutável, nao consigo ordenar. Solução: 
//		Collections.sort(curso.getAulas()); 
		List<Aula> aulas = new ArrayList<>(curso.getAulas());
		Collections.sort(aulas);

		System.out.println(curso.getTempoTotal());
	}

	public static void usingSet() {
		Set<String> nomesNaoGarantoOrdem = new HashSet<>();
		nomesNaoGarantoOrdem.add("Douglas");
		nomesNaoGarantoOrdem.add("Igor");
		nomesNaoGarantoOrdem.add("Inez");
		nomesNaoGarantoOrdem.add("Geraldo");
		nomesNaoGarantoOrdem.add("Geraldo");
		System.out.println(nomesNaoGarantoOrdem.size()); // 4 nao permite elementos duplicados
		boolean maisRapidoQueListUsamHash = nomesNaoGarantoOrdem.contains("Douglas");
		boolean maisRapidoQueList1UsamHash = nomesNaoGarantoOrdem.remove("Douglas");
//		Collections.sort(nomes); Só aceita List
		List<String> arrayList = new ArrayList<>(nomesNaoGarantoOrdem);
		Collections.sort(arrayList);
	}

	public static void relacionamentoCursoAluno() {
		Curso curso = getCurso();
		curso.getAlunos().forEach(a -> System.out.println(a));
	}

	public static void equalsAndHashCode() {
		Curso curso = getCurso();
		Aluno aluno = curso.getAlunos().iterator().next();
		System.out.println("Aluno next está matriculado: " + curso.estaMatriculado(aluno)); // true
//		Recebendo form da web
		String nome = "Douglas";
		Aluno a1 = new Aluno(nome, 11223); // mesmo objeto que contem na lista
		System.out.println("Aluno a1 está matriculado: " + curso.estaMatriculado(a1)); // false
		System.out.println("A1 == aluno " + (a1 == aluno)); // false pois compara referência na memoria
		System.out.println("A1 equals aluno " + (a1.equals(aluno))); // false pois usa == também

		System.out.println("------------------------------------");
//		Depois de sobrescrito o equals. Como List não usa Hash, apenas implementar o equals p ela basta
		System.out.println("A1 == aluno " + (a1 == aluno)); // false
		System.out.println("Aluno a1 está matriculado: " + curso.estaMatriculado(a1)); // false pois quando se trata
//		de Sets, precisamos implementar o hashCode
		System.out.println("HashCode iguais: " + (a1.hashCode() == aluno.hashCode())); // false
		System.out.println("A1 equals aluno " + (a1.equals(aluno))); // true

		System.out.println("------------------------------------");
//		Depois da implementação do HashCode
		System.out.println("A1 == aluno " + (a1 == aluno)); // false
		System.out.println("Aluno a1 está matriculado: " + curso.estaMatriculado(a1)); // true
		System.out.println("HashCode iguais: " + (a1.hashCode() == aluno.hashCode())); // true
		System.out.println("A1 equals aluno " + (a1.equals(aluno))); // true
	}

	public static void iteratorAndSet() {
//		foreach foi depois do java 1.5 antes usava assim
		Curso curso = getCurso();
		Iterator<Aluno> iterator = curso.getAlunos().iterator();
		while (iterator.hasNext()) {
			System.out.println("Aluno: " + iterator.next());
		}
	}

	public static void map() {
		Curso curso = getCurso();
		Aluno aluno = curso.buscarAlunoNumMatricula(11223);
		System.out.println(aluno);

		Map<Integer, String> pessoas = new HashMap<>();

		pessoas.put(21, "Leonardo Cordeiro");
		pessoas.put(27, "Fabio Pimentel");
		pessoas.put(19, "Silvio Mattos");
		pessoas.put(23, "Romulo Henrique");

		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
	}

}
