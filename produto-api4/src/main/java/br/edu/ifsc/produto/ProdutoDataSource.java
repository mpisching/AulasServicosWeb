package br.edu.ifsc.produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataSource {

	private static List<Produto> listaProdutos = new ArrayList<>();
	
	public static void criarLista() {
		listaProdutos.add(new Produto(1, "Tenis", 10, 120.0, 30));
		listaProdutos.add(new Produto(2, "Sapato", 50, 200.0, 10));
		listaProdutos.add(new Produto(3, "Calça", 4, 125.0, 20));
		listaProdutos.add(new Produto(4, "Casaco", 33, 128.0, 30));
		listaProdutos.add(new Produto(5, "Camiseta", 12, 123.0, 5));
	}
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static void novo(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public static List<ProdutoDTO> getListaProdutosDTO() {
		List<ProdutoDTO> resultado = new ArrayList<>();
		for (Produto produto: listaProdutos) {
			ProdutoDTO produtoDTO = new ProdutoDTO(produto.getNome(), produto.calcularPrecoVenda());
			resultado.add(produtoDTO);
		}
		
		return resultado;
	}
	
	public static ProdutoDTO calcularPrecoVendaDTO(int id) {
		ProdutoDTO produtoDTO = null;
		for (Produto produto : listaProdutos) {
			if (produto.getId() == id) {
				produtoDTO = new ProdutoDTO(produto.getNome(), produto.calcularPrecoVenda());
				return produtoDTO;
			}
		}
		produtoDTO = new ProdutoDTO("Não encontrado", 0.0);
		return produtoDTO;
	}
	
}
