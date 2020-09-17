package br.edu.ifsc.atividade;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {
	
	@RequestMapping(value = "/listar_funcionarios")
	public List<Funcionario> getFuncionarios() {
		return FuncionarioDataSource.getListaFuncionarios();
	}
	
	@RequestMapping(value = "/novo/{matricula}/{nome}/{salarioBase}")
	public Funcionario novoFuncionario(
			@PathVariable("matricula") int matricula,
			@PathVariable("nome") String nome, 
			@PathVariable("salarioBase") double salarioBase) {
//		Funcionario funcionario = new Funcionario();
//		funcionario.setMatricula(matricula);
//		funcionario.setNome(nome);
//		funcionario.setNumeroDependentes(dependentes);
//		funcionario.setSalarioBase(salarioBase);
		Funcionario funcionario = new Funcionario(matricula, nome, salarioBase);
		
		FuncionarioDataSource.add(funcionario);
		
		return funcionario;
	}
	
	@RequestMapping(value = "/funcionario_por_matricula/{matricula}", method = RequestMethod.GET)
	public Funcionario getPorMatricula(
			@PathVariable("matricula") int matricula) {
		return FuncionarioDataSource.getPorMatricula(matricula);
	}
	
	@RequestMapping(value = "/calcular_salario/{matricula}", method = RequestMethod.GET)
	public double calcularSalarioLiquido(
			@PathVariable("matricula") int matricula) {
		Funcionario funcionario = FuncionarioDataSource.getPorMatricula(matricula);
		if (funcionario != null) {
			return funcionario.calcularSalarioLiquido();
		} else {
			return 0.0;
		}
	}
	
	@RequestMapping(value = "/calcular_salario_dto/{matricula}")
	public FuncionarioDTO calcularSalarioDTO(
			@PathVariable(name = "matricula") int matricula) {
		Funcionario funcionario = FuncionarioDataSource.getPorMatricula(matricula);
		return funcionario.getFuncionarioDTO(); 
		
//		FuncionarioDTO funcionarioDTO = null;
		
//		if (funcionario != null) {
//			funcionarioDTO = new FuncionarioDTO(
//					funcionario.getSalarioBruto(), funcionario.calcularIrpf(),
//					funcionario.calcularInss(), funcionario.calcularSalarioLiquido());
//		}
		
		//if (funcionario != null) {
		//	return funcionario.getFuncionarioDTO();
		//}
		
		//return funcionarioDTO;
	}
	
}
