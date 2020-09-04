package br.edu.ifsc.produto;

public class Produto {
	
	private int id;
	private String nome;
	private int quantidade;
	private double preco;
	private int taxaLucro;
	
	public Produto() {
		
	}
	
	public Produto(int id, String nome, int quantidade, double preco, int taxaLucro) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.taxaLucro = taxaLucro;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getTaxaLucro() {
		return taxaLucro;
	}
	public void setTaxaLucro(int taxaLucro) {
		this.taxaLucro = taxaLucro;
	}
	
	//padrao de escrita camelCase
	public double calcularPrecoVenda() {
		return preco + (preco * taxaLucro / 100);
	}
	
	
	public double calcularDesconto(double precoVenda, double taxaDesconto) {
		return precoVenda - (precoVenda * taxaDesconto / 100);
	}
	
	//calculo do preco de venda ele pode ter um desconto
	public double calcularPrecoVenda(double taxaDesconto) {
		double precoVenda = calcularPrecoVenda();
		
		double precoComDesconto = calcularDesconto(precoVenda, taxaDesconto);
		
		return precoComDesconto;
	}	
	
}
