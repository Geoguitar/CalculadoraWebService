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
	
	<!-- 		Capturando os dados do formulário de entrada do usuário...	 -->		
		
	<%
		//String nome = request.getParameter("nomeInput"); //rescrito na linha 32.
		//String endereco = request.getParameter("enderecoInput"); //rescrito na linha 35.
		
	%>

		<!-- Colocando os dados no objeto usuário.. -->
	
	<%	
		String nome,endereco;  //inicializado para as mudanças nas linhas 18 e 19.
	
		//Instanciar o objetoUsuario apartir da classe Usuario.
		Usuario objetoUsuario = new Usuario();
		
		//objetoUsuario.setNomeUsuario(nome); //rescrito abaixo, mudança da linha 18.
		objetoUsuario.setNomeUsuario(nome = request.getParameter("nomeInput"));
		
		//objetoUsuario.setEnderecoUsuario(endereco); //rescrito abaixo, mudança da linha 19.
		objetoUsuario.setEnderecoUsuario(endereco = request.getParameter("enderecoInput"));
	%>

<!-- 		Capturando os dados do objetoUsuario... -->	
	
	<%
		String desNomeUsuario = objetoUsuario.getNomeUsuario();
		String desEndereco = objetoUsuario.getEnderecoUsuario();
	%>

	<font color="orange">
		<h2>Exibindo os dados cadastrados...</h2>
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