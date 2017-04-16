<%@page import="com.sun.glass.ui.Application"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Resultado</title>
</head>
<body>
	
		<div align="center">
		
		<h2>Resultado do Calculo de Aumento de Salário...</h2>
		
			<font color="red" size="5">
				<%String Nome = (String) application.getAttribute("Nome"); %>
				<%float AumentoSalario = (float) application.getAttribute("AumentoSalario");  %>
				<%float SalarioFinal = (float) application.getAttribute("SalarioFinal"); %>
				
				O novo salário de <%=Nome%> será de R$<%=SalarioFinal%> <br />
				
				O aumento de salário foi de <%=AumentoSalario%>
			</font>
		</div>
	
</body>
</html>