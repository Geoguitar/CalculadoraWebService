<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Usuário</title>
</head>
<body>

	<h1>Cadastrar Usuário</h1>
	<form action="cadastrar.jsp">

		<table>
			<tr>
				<td>Nome de Usuário:</td>
				<td><input type="text" name="nomeInput" /></td>
			</tr>
			<tr>
				<td>Endereço:</td>
				<td><input type="text" name="enderecoInput" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Inserir Usuário" /></td>
			</tr>
		</table>

	</form>
</body>
</html>