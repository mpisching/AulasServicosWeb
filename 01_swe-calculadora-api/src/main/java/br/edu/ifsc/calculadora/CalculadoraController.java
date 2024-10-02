package br.edu.ifsc.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.exception.UnsuportedMathOperationException;

@RestController
public class CalculadoraController {
	
	@RequestMapping(value ="/somar/{valor1}/{valor2}", method=RequestMethod.GET)
	public Double somar(@PathVariable("valor1") String valor1, @PathVariable("valor2") String valor2) throws Exception {
		if (!isNumeric(valor1) || !isNumeric(valor2)) {
			throw new UnsuportedMathOperationException("Por favor informe valores numéricos!");
		}
		Double soma = converterParaDouble(valor1) + converterParaDouble(valor2);
		return soma;
	}

	private Double converterParaDouble(String valorStr) {
		if (valorStr == null) return 0D;
		String valor = valorStr.replaceAll(",", ".");
		if (isNumeric(valor)) return Double.parseDouble(valor);
		return 0D;
	}

	private boolean isNumeric(String valorStr) {
		if (valorStr == null) return false;
		String valor = valorStr.replaceAll(",", ".");
		return valor.matches("[-+]?[0-9]*\\.?[0-9]+");
	}
}
