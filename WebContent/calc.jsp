<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String context = request.getContextPath(); %>

<h2>Calculation</h2>
<hr>
<form method="post" action="<%= context %>/controller/CalcController.do">
	<table border="1">
		The 1st Operand: <input type="text" name="operand1"><br>
		Input Operator: <input type="text" name="operator"><br>
		The 2nd Operand: <input type="text" name="operand2"><br>
		<input type="submit" value="Confirm">
	</table>
</form>

</body>
</html>