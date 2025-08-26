<%@page import="com.emp.modal.Employee"%>
<%@page import="com.emp.dao.EmployeeDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.emp.utils.DBconnections"%>
<%@ page import="com.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
<%
int empid= Integer.parseInt(request.getParameter("id"));
EmployeeDao dao=new EmployeeDao();
Employee emp=dao.getEmployee(empid);

%>

<h1>update Employee details  </h1> 

<form action="update" method="post">
<input type="hidden"  name="id" value="<%= empid %>"> <br><br>
Name:    <input type="text" name="name" value="<%= emp.getName() %>"><br><br>
Age:     <input type="number" name="age" value="<%= emp.getAge() %>"><br><br>
Phn num: <input type="text" name="phonenumber" value="<%= emp.getPhonenumber() %>"><br><br>
Email:   <input type="text" name="email" value="<%= emp.getEmail() %>"><br><br>
Salary:  <input type="text" name="salary" value="<%= emp.getSalary() %>"><br><br>
<input type="submit" value="update">
</form>
</body>
</html>