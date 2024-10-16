package br.edu.ifsc.fln.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Curso {
	private int id;
	private String nome;
	private int cargaHoraria;
	
	public Curso(int id, String nome, int cargaHoraria) {
		super();
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	

}
