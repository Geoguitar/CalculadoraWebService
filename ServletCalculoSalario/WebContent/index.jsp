<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Principal</title>
</head>
<body>
	<h2 align="center">Cálcular Aumento de Salário:</h2>

	<form action="CalcularSalario" name="form" method="post">

		<div align="center">
			<table>
				<tr>
					<td>Nome do Funcionário: </td> 
					<td><input name="nomeFuncionarioInput" type="text"></td>
				</tr>
				<tr>
					<td>Salário atual: </td>
					<td><input name="salarioAtualInput" type="text"></td>
				</tr>
				<tr>
					<td><input name="Enviar" type="submit" value="Enviar"></td>
				</tr>
			</table>
		</div>

	</form>
</body>
</html>