package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		//programando defensivamente, assim no equals por exemplo não preciso de verificar se o attr is null
		if(nome == null || nome.isEmpty()) {
			throw new IllegalArgumentException("Nome is required!");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	//Dois aluno serão iguais quando tiverem o mesmo nome
//	@Override
//	public boolean equals(Object aluno) {
//		Aluno other= (Aluno) aluno;
//		return this.nome.equals(other.getNome());
//	}
	
//	@Override
//	public int hashCode() {
//		return this.nome.hashCode();
//	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object aluno) {
		if (this == aluno)
			return true;
		if (aluno == null)
			return false;
		if (getClass() != aluno.getClass())
			return false;
		Aluno other = (Aluno) aluno;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", numeroMatricula=" + numeroMatricula + "]";
	}

}
