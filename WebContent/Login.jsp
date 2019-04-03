 
<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="style.css" />
</head>
<body>
	<div id="centre">
	<div ><h1>Bonjour et Bienvenue
	<br><strong>Veuillez vous authentifiez ?</strong></h1>
	<div id="date"><h2><% out.println(new Date()); %></h2></div>

	<% String log=request.getParameter("login");
	String pass=request.getParameter("password");
	if(log==null) log="";
	if(pass==null) pass="";
	out.println("<div id='form'><form action='/Bank/Control.jsp' method='post'>");
		out.println("<label id='log' >Login:</label><input  name='login' type='text' value='"+log+"'>");
		out.println("<br><label>Password:</label><input  name='password' type='password' value='"+pass+"'>");
		out.println("<br><br><input type='submit' value='Envoyer'>");
	out.println("</form></div>");
	%>
	</div>
	</div>
</body>
</html>