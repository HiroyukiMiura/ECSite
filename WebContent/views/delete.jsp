<%@page import="jp.co.aforce.beans.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!-- タグライブラリの使用を宣言する（必要に応じて） -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page import="jp.co.aforce.beans.Product"%>

<!doctype html>
<html>
<head>

<!-- 文字エンコーディングの指定 -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>管理者ページ</title>
</head>
<body>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>

	<div class="form" align="center">

		<span class="emsg">${product.emsg}</span> <span class="commsg">${product.commsg}</span>

		<div class="signin cf" align="center">
			<div class="formtitle">選手情報削除画面</div>

			<form action="../servlet/deleteServlet" method="post">

				<table border="1" style="background-color:lightgray;">
						<tr>
							<td>選手名</td>
							<td><input type="text" name="name" value="${product.name}"></td>
						</tr>
				</table>

				<input
					type="submit" name="button" value="削除" id="delete"
					onclick="return showConfirmDialog('削除')" />


			</form>

		</div>
	</div>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

</body>
</html>