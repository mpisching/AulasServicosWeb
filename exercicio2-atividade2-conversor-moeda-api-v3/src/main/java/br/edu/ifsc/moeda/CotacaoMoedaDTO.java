package br.edu.ifsc.moeda;

public class CotacaoMoedaDTO {
	private String moeda;
	private double compra;
	private double venda;
	public CotacaoMoedaDTO(String moeda, double compra, double venda) {
		super();
		this.moeda = moeda;
		this.compra = compra;
		this.venda = venda;
	}
	public String getMoeda() {
		return moeda;
	}
	public double getCompra() {
		return compra;
	}
	public double getVenda() {
		return venda;
	}
	
}
