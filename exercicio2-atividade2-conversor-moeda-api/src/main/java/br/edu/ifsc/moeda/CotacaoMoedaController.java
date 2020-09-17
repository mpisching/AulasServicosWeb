package br.edu.ifsc.moeda;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CotacaoMoedaController {

	@RequestMapping(value = "/converter_moeda/{valor}/{tipoMoeda}/{tipoOperacao}", method = RequestMethod.GET)
	public Double converterMoeda(
			@PathVariable(name = "valor") double valor, 
			@PathVariable(name = "tipoMoeda") String tipoMoeda, 
			@PathVariable(name = "tipoOperacao") String tipoOperacao) {
		
		Moeda moeda = MoedaDataSource.get(tipoMoeda);
		
		double cotacao = 0.0;
		
		if (moeda != null) {
			if (tipoOperacao.equalsIgnoreCase("venda")) {
				if (!tipoMoeda.equalsIgnoreCase("OU")) {
					cotacao = valor / moeda.getValorVenda();
				} else {
					cotacao = valor / calcularPrecoVendaOuro(moeda);
				}
			} else {
				cotacao = valor * moeda.getValorCompra();
			}
		}
		
		return cotacao;
	}
	
	private double calcularPrecoVendaOuro(Moeda moeda) {
		double precoVendaOuro = moeda.getValorCompra() + 
				(moeda.getValorCompra() * moeda.getValorVenda() / 100);
		return precoVendaOuro;
	}
	
}
