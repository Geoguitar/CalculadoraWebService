package br.com.caelum.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestListFuncionario {

	public static void main(String[] args) {

		FuncionarioDAO dao = new FuncionarioDAO();
		List<Funcionario> funcionarios = dao.getLista();
		
		for (Funcionario funcionario : funcionarios){
			
			System.out.println("Nome:" + funcionario.getNome());
			System.out.println("Usuário:" + funcionario.getUsuario() + "\n");
			
		}
	}

}
