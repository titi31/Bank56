 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<% String log=request.getParameter("login");
	String pass=request.getParameter("password");
	if(log==null) log="";
	if(pass==null) pass="";
	if(log.contentEquals("root") && pass.contentEquals("darki")){
		 
		out.println("connected");
	}else{
		
		request.getRequestDispatcher( "Login.jsp" ).include( request, response );
	}
%>
</head>
<body>

</body>
</html>