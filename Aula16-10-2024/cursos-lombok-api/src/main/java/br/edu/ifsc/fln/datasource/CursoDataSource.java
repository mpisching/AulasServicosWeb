package br.edu.ifsc.fln.datasource;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifsc.fln.domain.Curso;

public class CursoDataSource {
	private static List<Curso> cursos = new ArrayList<>();
	
	public static void inicializarLista() {
		cursos.add(new Curso(1, "TDS", 1200));
		cursos.add(new Curso(2, "GTI", 2400));
		cursos.add(new Curso(3, "CTII", 1100));
		cursos.add(new Curso(4, "ADM", 1200));
	}
	
	public static List<Curso> getCursos() {
		return cursos;
	}
	
	public static Curso pesquisar(int id) {
		for (Curso c : cursos) {
			if (c.getId() == id) {
				return c;
			}
		}
		return null;
	}
}
