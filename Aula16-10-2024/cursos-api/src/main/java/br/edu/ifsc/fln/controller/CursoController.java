package br.edu.ifsc.fln.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.fln.datasource.CursoDataSource;
import br.edu.ifsc.fln.domain.Curso;

@RestController
public class CursoController {
	
	@GetMapping("/curso")
	public Curso getCurso() {
		return CursoDataSource.pesquisar(1);
	}
	
	@GetMapping("/cursos")
	public List<Curso> listar() {
		return CursoDataSource.getCursos();
	}	

}
