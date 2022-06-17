<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ include file="menu.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Kotak Securities Clients</title>
<style>
input[type=text],input[type=number], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
td ,input[type=text],input[type=number],input[type=submit]{
  font-size: 20px;
}
input[type=date]{
width: 100%;
font-size: 30px;
}
div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
input[type=submit] {
  width: 150%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}
</style>
</head>
<body>
	<h1>Add Your Client Here...</h1>
	<div>
	<form action="saveClientDetails" method="post">
		<table>
			<tr>
				<td>Client Name:</td>
				<td><input type="text" name="name" placeholder="eg.Shravan" /></td>
			</tr>
			<tr>
				<td>Company:</td>
				<td><input type="text"  name="company" placeholder="eg.TataMotors" style="text-transform: uppercase;"/></td>
			</tr>
			<tr>
				<td>Quantity:</td>
				<td><input type="number" name="qty" placeholder="eg.500"/></td>
			</tr>
			<tr>
				<td>Buy Price:</td>
				<td><input type="number" step="0.01" placeholder="eg.410.50" name="price"/></td>
			</tr>
			<tr>
				<td>Client Code:</td>
				<td><input type="text"   name="code" placeholder="eg.YJPLA or 216P089" maxlength="7" style="text-transform: uppercase;"/></td>
			</tr>
			<tr>
				<td>Buy Date:</td>
				<td><input type="date" name="date" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="save" /></td>
			</tr>
		</table>

	</form>
	</div>
<h3>${msg}</h3>	
</body>

</html>