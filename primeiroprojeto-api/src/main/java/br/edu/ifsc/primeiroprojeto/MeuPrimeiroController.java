package br.edu.ifsc.primeiroprojeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //esta classe será responsável por receber requisições Web
public class MeuPrimeiroController {

	@GetMapping("/hello") 
	@ResponseBody
	public String hello() {
		return "Hello!!";
	}
	
	@GetMapping("/getNumeroInteiro")
	@ResponseBody
	public int getNumeroInteiro() {
		return 100;
	}
	
}

// IDE - Integrated Development Environment - 
// Ambiente de Desenvolvimento Integrado
// Spring Tool Suite
// Eclipse
// IntelliJ
// Netbeans
// VS Code
// CodeBlocks
// ...
// RAD - Rapid Application Development

// Framework - Spring Boot -- spring.io
// Pivotal - Spring Tool Suite - IDE

// API - Application Program Interface - Web Services
// cliente <---> API <----> Servidor (JAVA, C#, PHP, ...)

// JEE --> Jakarta Enterprise Edition (versão do java para 
//	desenvolvimento corporativo (cliente/servidor)
// JSE --> Java Standard Edition
// cliente --> HTML, pode ser qualquer outro tipo de aplicação que comunica via HTP
// Spring Boot - REST -- HTTP (WWW - World Wide Web)


// Apache Maven 