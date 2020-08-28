package br.edu.ifsc.produto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoApiApplication {

	public static void main(String[] args) {
		
		ProdutoDataSource.criarLista();
		
		SpringApplication.run(ProdutoApiApplication.class, args);
	}

}
