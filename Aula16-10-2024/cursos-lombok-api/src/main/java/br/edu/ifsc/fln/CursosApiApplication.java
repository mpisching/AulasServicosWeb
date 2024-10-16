package br.edu.ifsc.fln;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifsc.fln.datasource.CursoDataSource;



@SpringBootApplication
public class CursosApiApplication {

	public static void main(String[] args) {
		CursoDataSource.inicializarLista();
		SpringApplication.run(CursosApiApplication.class, args);
	}

}
