<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>選手登録画面</title>
</head>
<body>
<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>

<div class="form" align="center">
	<h3>選手登録画面</h3>
	<form action="../servlet/registServlet" method="post">
		<table border="1" style="background-color:lightgray;">
			<tr>
				<td>名前</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>年俸</td>
				<td><input type="number" name="price"></td>
			</tr>
		</table>
		<input type="submit" name="button" value="選手登録" id="regist"></input>
	</form>

</div>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

</body>
</html>