<%@page import="java.util.Date"%>
<%@page import="com.mysql.fabric.xmlrpc.Client"%>
<%@page import="javaBeans.Cliente"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<div align="center" >
			<%
				Cliente objCliente = new Cliente();
				objCliente.setNome("Geovane");
			%>

			<font color="green" size="8"> 
			O nome do Cliente é:
			<font color="blue" size="8">
			<%=objCliente.getNome()%>
			</font>
			</font>
			
			<%
				Date dataAtual = new Date();
			%>
			
			</br> 
			<font color="green" size="5">
			Data de Hoje:
			<font color="gray" size="5">	
			<%=dataAtual%>
			</font>
			</font>
		</div>
	</form>
</body>
</html>
