package br.com.caelum.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaRemove {

	public static void main(String[] args) {

		Contato contato = new Contato();
		ContatoDao dao = new ContatoDao();
		contato.setId((long) 3);
		dao.remove(contato);
	}
}
