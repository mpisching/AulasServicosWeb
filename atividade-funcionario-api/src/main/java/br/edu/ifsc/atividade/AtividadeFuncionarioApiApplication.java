package br.edu.ifsc.atividade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtividadeFuncionarioApiApplication {

	public static void main(String[] args) {
		FuncionarioDataSource.criarLista();
		SpringApplication.run(AtividadeFuncionarioApiApplication.class, args);
	}

}
