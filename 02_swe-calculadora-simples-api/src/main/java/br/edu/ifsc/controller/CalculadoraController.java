package br.edu.ifsc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.math.Calculadora;

@RestController
public class CalculadoraController {
	
	@RequestMapping(value = "/somar/{valor1}/{valor2}", method = RequestMethod.GET)
	public Double somar(@PathVariable("valor1") double valor1, @PathVariable("valor2") double valor2) {
		Calculadora calc = new Calculadora();
		//return calc.somar(valor1, valor2);
		return valor1 + valor2;
	}
	
	@RequestMapping(value = "/subtrair/{valor1}/{valor2}", method = RequestMethod.GET)
	public Double subtrair(@PathVariable("valor1") double valor1, @PathVariable("valor2") double valor2) {
		Calculadora calc = new Calculadora();
		return calc.subtrair(valor1, valor2);
	}
}
