package br.edu.ifsc.calculadora.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello, " + name;
	}
}
