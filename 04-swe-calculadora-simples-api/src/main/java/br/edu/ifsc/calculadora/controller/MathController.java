package br.edu.ifsc.calculadora.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.math.SimpleMath;

@RestController
public class MathController {

	@RequestMapping(value = "/sum/{op1}/{op2}", method = RequestMethod.GET)
	public Double sum(@PathVariable("op1") Double op1, @PathVariable("op2") Double op2) {
		SimpleMath math = new SimpleMath();
		return math.sum(op1, op2);
	}
}
