<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<%  String name =(String) request.getAttribute("name");
	String pass =(String) request.getAttribute("password");
%>

<h2> Hi <%= name %> u signg in..</h1> 
<h2> Ur password is : <%= pass %> </h1>
</body>
</html>