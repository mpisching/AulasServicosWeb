package br.edu.ifsc.calculadora;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	
	//anotações para orientação ao Framework Spring Boot
	@RequestMapping(value = "/somar/{valor1}/{valor2}", method = RequestMethod.GET)
	public Double somar(
			@PathVariable("valor1") Double valor1, 
			@PathVariable("valor2") Double valor2) {
		return valor1 + valor2;
	}
	
	@RequestMapping(value = "/subtrair/{valor1}/{valor2}")
	public Double subtrair(
			@PathVariable("valor1") Double valor1, 
			@PathVariable("valor2") Double valor2) {
		return valor1 - valor2;
	}
}
