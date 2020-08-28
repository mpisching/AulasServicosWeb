package br.edu.ifsc.produto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	@RequestMapping(value = "/calcular_total/{quantidade}/{valorUnitario}", method = RequestMethod.GET)
	public Double calcularValorTotal(
			@PathVariable("quantidade") int quantidade, 
			@PathVariable("valorUnitario") Double valorUnitario, 
			Double total) {
		
		total = quantidade * valorUnitario;
		
		return total;
	}
	
	
	@RequestMapping(value = "/preco_venda/{preco}/{taxa}")
	public Double calcularPrecoVenda(
			@PathVariable("preco") double preco,
			@PathVariable("taxa") int taxa) {
		
		double precoVenda = calcularPrecoProduto(preco, taxa);
		
		return precoVenda;
	}
	
	private Double calcularPrecoProduto(double preco, int taxa) {
		return preco + (preco * taxa / 100);
	}
}
