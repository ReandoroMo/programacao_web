<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Informa��o da Sess�o</title>
</head>
<body>
	<h1>
		O ID da sess�o �:
	</h1>
	<h2>
		<%=
			session.getId()	
		%>
	</h2>
</body>   
</html>