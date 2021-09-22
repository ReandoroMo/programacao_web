<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Cadastro </title>
</head>
<body>

	<h2>Preencha com seus dados:</h2>
	
	<form action="ServletTela1Cadastro" method="post">
		Nome: <input type="text" name="nome"> <br>
		Sobrenome: <input type="text" name="sobrenome"> <br>
		Endereço residencial: <br>
		Logradouro: <input type="text" name="rua"> <br> 
		Complemento: <input type="text" name="complemento"> <br>
		Cidade: <input type="text" name="cidade"> <br>
		CEP: <input type="text" name="cep"> <br>
		Estado: <input type="text" name="estado"> <br>
		<input type="submit" value="Próxima tela">
	</form>

</body>
</html>