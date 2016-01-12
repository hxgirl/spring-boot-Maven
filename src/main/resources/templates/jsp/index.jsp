<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">

<body>
	<h1>${message}</h1>
	<form action="" method="post">
		<table>
			<tr>
				<td>id:</td>
				<td><input type="text" name="userid" /></td>
			</tr>
			<tr>
				<td>pw:</td>
				<td><input type="password" name=pwd /></td>
			</tr>
			<tr>
			<td><input type="submit" value="login" /></td>
			<td><input type="reset" value="reset" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>