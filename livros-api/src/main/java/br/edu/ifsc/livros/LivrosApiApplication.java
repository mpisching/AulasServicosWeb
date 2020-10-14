package br.edu.ifsc.livros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LivrosApiApplication {

	public static void main(String[] args) {
		LivroDataSource.criarLista();
		SpringApplication.run(LivrosApiApplication.class, args);
	}

}
