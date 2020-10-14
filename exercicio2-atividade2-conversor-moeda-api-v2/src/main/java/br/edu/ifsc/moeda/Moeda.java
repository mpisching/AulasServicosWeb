package br.edu.ifsc.moeda;

public class Moeda {
	private String nome;
	private String sigla;
	private Double valorCompra;
	private Double valorVenda;
	public Moeda(String nome, String sigla, Double valorCompra, Double valorVenda) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
	}
	public Moeda() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public Double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
}
