package br.edu.ifsc.atividade;

public class Funcionario {
	private int matricula;
	private String nome;
	private double salarioBruto;
	
	public Funcionario() {
		super();
	}

	public Funcionario(int matricula, String nome, double salarioBruto) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
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
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	public double calcularSalarioLiquido() {
//		double irpf = calcularIrpf();
//		double salarioFamilia = calcularSalarioFamilia();
//		double salarioLiquido = salarioBase - irpf + salarioFamilia;
//		return salarioLiquido;
		
		return salarioBruto - calcularIrpf() - calcularInss();
	}
	
	/*
	 * Regra para calcular o IRPF com base nas seguintes faixas:
		• isento até R$ 1.903,98
		• 7.5% com dedução de R$ 142,80: R$ 1.903,99 a R$ 2.826,65
		• 15% com dedução de R$ 354,80: R$ 2.826,66 a R$ 3.751,05
		• 22,5% com dedução de R$ 636,13: R$ 3.751,06 a R$ 4.664,68
		• 27,5% com dedução de R$ 869,36: Acima de R$ 4.664,68
	 */
	private double calcularIrpf() {
//		if (salarioBruto > 4664.68) {
//			return (salarioBruto * 0.275) - 869.36;
//		} else if (salarioBruto >=  3751.06) {
//			return (salarioBruto * 0.225) - 636.13;
//		} else if (salarioBruto >= 2826.66) {
//			return (salarioBruto * 0.15) - 354.80;
//		} else if (salarioBruto >= 1903.99) {
//			return (salarioBruto * 0.075) - 142.80;
//		} else {
//			return 0.0;
//		}
		
		if (salarioBruto > 4664.68) return (salarioBruto * 0.275) - 869.36;
		else if (salarioBruto >=  3751.06) return (salarioBruto * 0.225) - 636.13;
		else if (salarioBruto >= 2826.66) return (salarioBruto * 0.15) - 354.80;
		else if (salarioBruto >= 1903.99) return (salarioBruto * 0.075) - 142.80;
		else return 0.0;
	}
	
	/*
	 * Regra para calcular a contribuição de INSS (para trabalhador assalariado - CELETISTA - CLT):
		• Até R$ 1.045,00: descontar 7,5 do salário bruto
		• de R$ 1.045,01 até R$ 2.089,60: descontar 9% do salário bruto
		• de R$ 2.089,61 até R$ 3.134,40: descontar 12% do salário bruto
		• de R$ 3.134,41 até R$ 6.101,06: descontar 14% do salário bruto
	 */
	private double calcularInss() {
		if (salarioBruto > 6101.06) {
			return 6101.06 * 0.14;
		} else if (salarioBruto >= 3134.41) {
			return salarioBruto * 0.14;
		} else if (salarioBruto >= 2089.61) {
			return salarioBruto * 0.12;
		} else if (salarioBruto >= 1045.01) {
			return salarioBruto * 0.12;
		} else {
			return salarioBruto * 0.075;
		}
	}
	
	public FuncionarioDTO getFuncionarioDTO() {
		FuncionarioDTO funcionarioDTO = new FuncionarioDTO(
				this.getSalarioBruto(), this.calcularIrpf(),
				this.calcularInss(), this.calcularSalarioLiquido());
		return funcionarioDTO;
	}
	
}
