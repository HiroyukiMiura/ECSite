<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>

<h1 style="margin:auto;margin-top:20px;text-align:center;">プロ選手契約サイト（NPB公認）</h1>

<div style="margin:auto;margin-top:30px;margin-bottom:50px;border:solid;text-align:center;background-color:lightgray;
	width:500px;">
	<form action="../Login.action" method="post">
	<p style="font-weight:bold;">ログインフォーム</p>
	<p>ログイン名：<input type="text" name="login"></p>
	<p>パスワード：<input type="password" name="password"></p>
	<p><input type="submit" value="ログイン"></p>
	</form>
</div>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

<%@include file="footer.jsp" %>