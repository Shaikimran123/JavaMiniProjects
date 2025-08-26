<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h1> This is JSP page ...</h1>
<% String name="Imran";
out.println(name);
%>
<h1> Hi <%= name %>, This is ur JSP Expression tag </h1>

</body>
</html>