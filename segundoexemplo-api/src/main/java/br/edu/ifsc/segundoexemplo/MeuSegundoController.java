package br.edu.ifsc.segundoexemplo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuSegundoController {

	@GetMapping("/sayhello")
	@ResponseBody
	public String sayHello() {
		return "Hello Spring Boot Programmer!!!";
	}
}
