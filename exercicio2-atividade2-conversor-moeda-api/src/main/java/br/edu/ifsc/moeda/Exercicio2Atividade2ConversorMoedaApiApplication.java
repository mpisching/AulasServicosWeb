package br.edu.ifsc.moeda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio2Atividade2ConversorMoedaApiApplication {

	public static void main(String[] args) {
		MoedaDataSource.criarLista();
		SpringApplication.run(Exercicio2Atividade2ConversorMoedaApiApplication.class, args);
	}

}
