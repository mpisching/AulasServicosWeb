package br.edu.ifsc.produto;

public class ProdutoDTO {

	private String nome;
	private double precoVenda;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoVenda() {
		return precoVenda;
	}
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	public ProdutoDTO(String nome, double precoVenda) {
		super();
		this.nome = nome;
		this.precoVenda = precoVenda;
	}
	
	
}
