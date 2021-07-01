<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>選手管理画面</title>
</head>
<body>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>

<h2 style="text-align:center;">管理者画面</h2>
<div style="margin:auto;text-align:center;border:solid;padding:100px;width:700px;">
	<form action="servlet/manegementServlet" method="post">
		<p><input type="submit" name="button" value="選手登録" id="regist" style="width:500px;height:100px;padding:30px;"></input></p>
		<p><input type="submit" name="button" value="選手削除" id="delete" style="width:500px;height:100px;padding:30px;"></input></p>
		<p><input type="submit" name="button" value="選手変更" id="update" style="width:500px;height:100px;padding:30px;"></input></p>
	</form>
</div>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

</body>
</html>