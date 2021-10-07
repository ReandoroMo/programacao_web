<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Número de acessos</title>
</head>
<body>
<% Criando_sessao.Contador.novoAcesso(); %>
  
Este é o acesso de número: 

<%= Criando_sessao.Contador.getContadorAcesso() %>

<p>
Data e hora inicial: 

<%= Criando_sessao.Contador.getDataEHora1() %>

<p> 
Data e hora final: 

<%= Criando_sessao.Contador.getDataEHora2() %>
</body>
</html> 