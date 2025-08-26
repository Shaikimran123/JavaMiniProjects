<%@ page import="java.util.*, com.emp.modal.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees</title>
</head>
<body>
<marquee> Welcome <%=session.getAttribute("email") %></marquee>

<hr>
<a href="addEmployess.jsp" >Add a new Employee</a>
<br><hr> <br>
<table border="1">
<tr>
<th> Employee ID </th> 
<th> Employee Name </th>
<th> Employee Age </th>
<th> Employee PhoneNumber </th>
<th> Employee Email </th>
<th> Employee Salary </th>
</tr>
<% List<Employee> list= (List<Employee>) request.getAttribute("emplist");
for(Employee emp:list){
%>
<tr>
	<td><%= emp.getEmpid() %></td>
	<td><%= emp.getName()  %></td>
	<td><%= emp.getAge()  %></td>
	<td><%= emp.getPhonenumber()  %></td>
	<td><%= emp.getEmail()  %></td>
	<td><%= emp.getSalary()  %></td>
	<td><a href="updateEmp.jsp?id=<%= emp.getEmpid() %>">update Employee</a>
	<td><a href="delet?id=<%= emp.getEmpid() %>" >Delete Employee</a> 	
</tr>

<% } %>


</table>



</body>
</html>