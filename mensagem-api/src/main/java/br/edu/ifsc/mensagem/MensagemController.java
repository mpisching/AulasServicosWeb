package br.edu.ifsc.mensagem;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MensagemController {
	
	private static final String template = "Olá, %s!";
	
	private final AtomicLong contador = new AtomicLong(); 
	
	@RequestMapping("/mensagem")
	public Mensagem mensagem(@RequestParam(value="nome", defaultValue="Mundo")
			String nome) {
		return new Mensagem(contador.incrementAndGet(), String.format(template, nome));
	}
	
}
