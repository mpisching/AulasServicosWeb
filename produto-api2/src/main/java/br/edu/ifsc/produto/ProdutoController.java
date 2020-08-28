package br.edu.ifsc.produto;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

//	@RequestMapping(value = "/produto/{id}/{nome}/{preco}/{quantidade}/{taxaLucro}")
//	public Produto criarProduto(
//			@PathVariable("id") int id, 
//			@PathVariable("nome") String nome, 
//			@PathVariable("preco") double preco, 
//			@PathVariable("quantidade") int quantidade, 
//			@PathVariable("taxaLucro") int taxaLucro) {
//		
////		Produto produto = new Produto();
////		produto.setId(id);
////		produto.setNome(nome);
////		produto.setPreco(preco);
////		produto.setQuantidade(quantidade);
////		produto.setTaxaLucro(taxaLucro);
//		
//		Produto produto = new Produto(id, nome, quantidade, preco, taxaLucro);
//		
//		return produto;
//	}
	
	@RequestMapping(value = "/produto/{id}/{nome}/{preco}/{quantidade}/{taxaLucro}")
	public double criarProduto(
			@PathVariable("id") int id, 
			@PathVariable("nome") String nome, 
			@PathVariable("preco") double preco, 
			@PathVariable("quantidade") int quantidade, 
			@PathVariable("taxaLucro") int taxaLucro) {
		Produto produto = new Produto(id, nome, quantidade, preco, taxaLucro);
		return produto.calcularPrecoVenda();
	}	
}
