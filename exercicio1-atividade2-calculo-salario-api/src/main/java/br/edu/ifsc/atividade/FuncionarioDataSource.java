package br.edu.ifsc.atividade;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioDataSource {
	private static List<Funcionario> listaFuncionarios = new ArrayList<>();
	
	public static void criarLista() {
		listaFuncionarios.add(new Funcionario(100, "Lucas", 4000.0));
		listaFuncionarios.add(new Funcionario(101, "Mateus", 2400.0));
		listaFuncionarios.add(new Funcionario(102, "Margarete", 14000.0));
		listaFuncionarios.add(new Funcionario(103, "luciana", 2600.0));
	}

	public static List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public static void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		FuncionarioDataSource.listaFuncionarios = listaFuncionarios;
	}
	
	public static void add(Funcionario funcionario) {
		listaFuncionarios.add(funcionario);
	}
	
	public static Funcionario getPorMatricula(int matricula) {
		for (Funcionario funcionario: listaFuncionarios) {
			if (funcionario.getMatricula() == matricula) {
				return funcionario;
			}
		}
		return null;
	}
	
	
}
