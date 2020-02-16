package br.com.alura;

public class Aula implements Comparable<Aula>{
	
	private String nome;
	private byte tempo;
	
	public Aula(String nome, byte tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public byte getTempo() {
		return tempo;
	}
	public void setTempo(byte tempo) {
		this.tempo = tempo;
	}
	@Override
	public String toString() {
		return "Aula [nome=" + nome + ", tempo=" + tempo + "]";
	}
	@Override
	public int compareTo(Aula otherAula) {
		return this.nome.compareTo(otherAula.getNome());
	}

}
