package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<>();
	private Set<Aluno> alunos= new HashSet<>();
	private Map<Integer, Aluno> alunosNumMatricula= new HashMap<>();
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

//	Programando defensivamente, somente o objeto Curso poderá add aulas.
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
//	Somente o objeto curso será responsável por add aulas
	public void add(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.alunosNumMatricula.put(aluno.getNumeroMatricula(), aluno);
	}
	
//	Sem HashMap
//	public Aluno buscarAlunoNumMatricula(int numMatricula) {
//		for (Aluno aluno : alunos) {
//			if(aluno.getNumeroMatricula() == numMatricula) {
//				return aluno;
//			}
//		}
//		throw new NoSuchElementException("Aluno não encontrado");
//	}
	
	public Aluno buscarAlunoNumMatricula(int numMatricula) {
		return alunosNumMatricula.get(numMatricula);
	}
	
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", instrutor=" + instrutor + ", aulas=" + aulas + "]";
	}
	
	
}
