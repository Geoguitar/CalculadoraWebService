<%@ page import="javaBean.Usuario"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuário Cadastrado</title>
</head>
<body>

	<h1>Cadastrar Usuário</h1>
	<font color="blue">
		<h2>Capturando os dados do formulário de entrada do usuário...</h2>
	</font>
	<%
		String nome = request.getParameter("nomeInput");
		String endereco = request.getParameter("enderecoInput");
		
	%>

	<font color="green">
		<h2>Colocando os dados no objeto usuário..</h2>
	</font>
	<%	
		//Instanciar o objetoUsuario apartir da classe Usuario
		Usuario objetoUsuario = new Usuario();
		objetoUsuario.setNomeUsuario(nome); 
		objetoUsuario.setEnderecoUsuario(endereco);
	%>

	<font color="black">
		<h2>Capturando os dados do objetoUsuario...</h2>
	</font>
	<%
		String desNomeUsuario = objetoUsuario.getNomeUsuario();
		String desEndereco = objetoUsuario.getEnderecoUsuario();
	%>

	<font color="orange">
		<h2>Exibindo os dados...</h2>
	</font>
	<table>
		<tr>
			<td>Nome de Usuário -></td>
			<td><%=desNomeUsuario%></td>
		</tr>

		<tr>
			<td>Endereço do Usuário -></td>
			<td><%=desEndereco%></td>
		</tr>
	</table>

</body>
</html>