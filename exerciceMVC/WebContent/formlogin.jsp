<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Title of the document</title>
</head>
<body>
	<form action="doLogin" method="post">
		<table>
			<tr>
				<td><input type="text" name="login" value=""
					placeholder="Login" size="20" maxlength="20"></input></td>
			</tr>
			<tr>
				<td><input type="password" name="password" value=""
					placeholder="Password" size="20" maxlength="20"></input></td>
			</tr>
			<tr>
				<td><input type="submit" name="Login"></input></td>
			</tr>
		</table>
	</form>
</body>
</html>