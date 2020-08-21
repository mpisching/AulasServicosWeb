package br.edu.ifsc.curso;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

//	private static final String template = "%s!";
	
	private final AtomicLong contador = new AtomicLong(); 
	
	@GetMapping("/curso")
	public Curso getCurso(@RequestParam(value="nome", defaultValue = "Desconhecido") String nome) {
		return new Curso(contador.incrementAndGet(), nome);
	}
}
