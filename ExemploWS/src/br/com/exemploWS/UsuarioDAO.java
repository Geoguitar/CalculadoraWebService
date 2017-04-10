package br.com.exemploWS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioDAO {

	public boolean inserirUsuario(Usuario usuario) {

		try {

			Connection con = ConectaMySql.obtemConexao();

			String queryInserir = "INSERT INTO usuario VALUES (null,?,?)";
			PreparedStatement ppStm = con.prepareStatement(queryInserir);

			ppStm.setString(1, usuario.getNome());
			ppStm.setInt(2, usuario.getIdade());

			ppStm.executeUpdate();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean atualizarUsuario(Usuario usuario) {

		try {

			Connection con = ConectaMySql.obtemConexao();

			String queryInserir = "UPDATE usuario SET nome = ?, idade = ?, WHERE id = ?";
			PreparedStatement ppStm = con.prepareStatement(queryInserir);

			ppStm.setString(1, usuario.getNome());
			ppStm.setInt(2, usuario.getIdade());
			ppStm.setInt(3, usuario.getId());

			ppStm.executeUpdate();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean excluirUsuario(Usuario usuario) {

		try {

			Connection con = ConectaMySql.obtemConexao();

			String queryExcluir = "DELETE FROM usuario WHERE id = ?";
			PreparedStatement ppStm = con.prepareStatement(queryExcluir);

			ppStm.setInt(1, usuario.getId());

			ppStm.executeUpdate();
			con.close();

		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public ArrayList<Usuario> buscarTodosUsuarios() {

		ArrayList<Usuario> lista = new ArrayList<Usuario>();

		try {

			Connection con = ConectaMySql.obtemConexao();

			String queryInserir = "SELECT * FROM usuario";

			PreparedStatement ppStm = con.prepareStatement(queryInserir);

			ResultSet rSet = ppStm.executeQuery();

			while (rSet.next()) {

				Usuario usr = new Usuario();

				usr.setId(rSet.getInt(1));
				usr.setNome(rSet.getString(2));
				usr.setIdade(rSet.getInt(3));

				lista.add(usr);
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return lista;
	}

	public Usuario buscarUsuarioPorID(int id) {

		Usuario usr = null;

		try {

			Connection con = ConectaMySql.obtemConexao();

			String queryInserir = "SELECT * FROM usuario WHERE id = ?";
			PreparedStatement ppStm = con.prepareStatement(queryInserir);

			ppStm.setInt(1, id);

			ResultSet rSet = ppStm.executeQuery();
			if (rSet.next()) {

				usr = new Usuario();

				usr.setId(rSet.getInt(1));
				usr.setNome(rSet.getString(2));
				usr.setIdade(rSet.getInt(3));
			} else {
				return usr;
			}

			con.close();

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return usr;
	}

	public boolean excluirUsuario(int id) {

		return excluirUsuario(new Usuario(id, "", 0));
	}

}
