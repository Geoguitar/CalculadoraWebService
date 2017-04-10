package br.com.caelum.teste;

import br.com.caelum.jdbc.dao.FuncionarioDAO;
import br.com.caelum.jdbc.modelo.Funcionario;

public class TestRemoveFuncionario {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		FuncionarioDAO dao = new FuncionarioDAO();
		funcionario.setId((long) 5);
		dao.remove(funcionario);
		
		System.out.println("Funcionário removido !");
	}

}
