<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   <%@ include file="menu.jsp" %>
   
<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>All Clients</title>
<style>
table, td, th {  
  border: 1px solid #ddd;
  text-align: left;
}

table {
  border-collapse: collapse;
  width: 90%;
}
th ,td{
  font-size: 25px;
}
th, td {
  padding: 10px;
}
input[type=text], select {
  width: 25%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
button[type=submit],button[type=reset] {
  width: 10%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
a:link, a:target {
  background-color: blue;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}

</style>
</head>
<body>
	<h1>All Clients</h1>
	<form action="search" method="get">
		<input type = "text" name="keyword" value="${keyword}" placeholder="Find by name or company or code"/>
		<button type="submit" >Search</button>
 		 <button type="reset" >Clear</button>
	</form>
	<table border='1'>
		<tr>
			<th>Client Id</th>
			<th>Client Name</th>
			<th>Company</th>
			<th>Quantity</th>
			<th>Buy Price</th>
			<th>Client Code</th>
			<th>Buy Date</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		
			<c:forEach items="${clients}" var="client">
				<tr>
					<td>${client.id }</td>
					<td>${client.name }</td>
					<td>${client.company }</td>
					<td>${client.qty }</td>
					<td>${client.price }</td>
					<td>${client.code }</td>
					<td>${client.date }</td>
					<td><a href="updateClient?id=${client.id }">update</a></td>
					<td><a href="deleteClient?id=${client.id }">delete</a></td>
				</tr>
			</c:forEach>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.id }</td>
					<td>${list.name }</td>
					<td>${list.company }</td>
					<td>${list.qty }</td>
					<td>${list.price }</td>
					<td>${list.code }</td>
					<td>${list.date }</td>
					<td><a href="updateClientSearch?id=${list.id }">update</a></td>
					<td><a href="deleteClientSearch?id=${list.id }">delete</a></td>
				</tr>
			</c:forEach>
	</table>
	
</body>
</html>