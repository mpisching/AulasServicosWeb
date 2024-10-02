package br.edu.ifsc.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
	
	@RequestMapping(value = "/somar/{valor1}/{valor2}", method = RequestMethod.GET)
	public double somar(@PathVariable("valor") double valor1, @PathVariable("valor2") double valor2) {
		return valor1 + valor2;
	}
}
