<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Agenda - Ex 2</title>
	</head>
	<body>
		<h1>Formulário de Agenda</h1>
		<form action="ServletAgenda">
			<p>Nome:</p>
			<input type="text" name="nome" placeholder="Seu nome"/>
			<p>Telefone:</p>
			<input type="tel" name="telefone" placeholder="Seu telefone"/>
			<p>Data de nascimento:</p>
			<input type="date" name="dta_de_nascimento" placeholder="Seu nascimento"/>
			<BR>
			<input type="submit" name="enviar" value="enviar">
			
		</form>

	</body>
</html>