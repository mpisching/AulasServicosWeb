package br.edu.ifsc.produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataSource {

	private static List<Produto> listaProdutos = new ArrayList<>();
	
	public static void criarLista() {
		listaProdutos.add(new Produto(100, "Tenis", 10, 120.0, 30));
		listaProdutos.add(new Produto(220, "Sapato", 50, 200.0, 10));
		listaProdutos.add(new Produto(115, "Calça", 4, 125.0, 20));
		listaProdutos.add(new Produto(400, "Casaco", 33, 128.0, 30));
		listaProdutos.add(new Produto(500, "Camiseta", 12, 123.0, 5));
	}
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static void novo(Produto produto) {
		listaProdutos.add(produto);
	}
	
	public static Produto pesquisaPorId(int id) { //0; 1; 2; ... 4
//		for (int i = 0; i < listaProdutos.size(); i++) {
//			Produto produto = listaProdutos.get(i);
//			if (produto.getId() == id) {
//				return produto;
//			}
//		}
		
		//for aprimorado ... foreach
		for (Produto produto : listaProdutos) {
			if (produto.getId() == id) {
				return produto;
			}
		}
		
		return null;
	}
	
}
