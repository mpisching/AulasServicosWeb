package br.edu.ifsc.atividade;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBase;
	private int numeroDependentes;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, double salarioBase, int numeroDependentes) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.numeroDependentes = numeroDependentes;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}
	
	public double calcularSalarioLiquido() {
//		double irpf = calcularIrpf();
//		double salarioFamilia = calcularSalarioFamilia();
//		double salarioLiquido = salarioBase - irpf + salarioFamilia;
//		return salarioLiquido;
		
		return salarioBase - calcularIrpf() + calcularSalarioFamilia();
	}
	
	private double calcularIrpf() {
		if (salarioBase >= 8500.0) {
			return salarioBase * 0.275;
		} else if (salarioBase >= 5000) {
			return salarioBase * 0.15;
		} else {
			return 0.0;
		}
	}
	
	private double calcularSalarioFamilia() {
		return numeroDependentes * 150.0;
	}
}
