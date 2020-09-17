package br.edu.ifsc.atividade;

public class FuncionarioDTO {
	private double salarioBruto;
	private double irpf;
	private double inss;
	private double salarioLiquido;
	
	public FuncionarioDTO(double salarioBruto, double irpf, double inss, double salarioLiquido) {
		super();
		this.salarioBruto = salarioBruto;
		this.irpf = irpf;
		this.inss = inss;
		this.salarioLiquido = salarioLiquido;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getIrpf() {
		return irpf;
	}
	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}
	public double getInss() {
		return inss;
	}
	public void setInss(double inss) {
		this.inss = inss;
	}
	public double getSalarioLiquido() {
		return salarioLiquido;
	}
	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}
	
	
}
