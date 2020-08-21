package br.edu.ifsc.curso;

public class Curso {
	
	private final long id;//constante
	
	private final String nome; 

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Curso(long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
}

