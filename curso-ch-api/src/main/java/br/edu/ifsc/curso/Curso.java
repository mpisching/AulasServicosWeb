package br.edu.ifsc.curso;

public class Curso {
	
	private final long id;
	
	private final String nome;
	
	private final int cargaHoraria;

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public Curso(long id, String nome, int cargaHoraria) {
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}

}

