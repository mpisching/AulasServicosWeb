package br.edu.ifsc.produto;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {

	@RequestMapping(value = "/produto/{id}/{nome}/{preco}/{quantidade}/{taxaLucro}")
	public Produto criarProduto(
			@PathVariable("id") int id, 
			@PathVariable("nome") String nome, 
			@PathVariable("preco") double preco, 
			@PathVariable("quantidade") int quantidade, 
			@PathVariable("taxaLucro") int taxaLucro) {
		
	
		Produto produto = new Produto(id, nome, quantidade, preco, taxaLucro);
		produto.setNome(nome);
		
		ProdutoDataSource pds = new ProdutoDataSource(); 
		
		pds.novo(produto);
		
		ProdutoDataSource.novo(produto);
		
		return produto;
	}
	
	@RequestMapping(value = "/preco_venda/{idx}")
	public double calcularPrecoVenda(
			@PathVariable("idx") int idx) {
		Produto produto = ProdutoDataSource.getListaProdutos().get(idx);
		return produto.calcularPrecoVenda();
	}
	
	
	@RequestMapping(value = "/produtos")
	public List<Produto> getProdutos() {
		return ProdutoDataSource.getListaProdutos();
	}
	
}
