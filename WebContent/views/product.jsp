<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>
<div style="margin:auto;text-align:center;">
	<h2>選手契約サイトへようこそ！</h2>
	<h2>下から契約したい選手を検索して選んでね</h2>
	<p>検索キーワードを入力してください</p>
	<form action="Product.action" method="post">
	<input type="text" name="keyword">
	<input type="submit" value="検索">
	</form>
</div>
<hr>

<table style="border-collapse:separate;border-spacing:10px;border:solid;
	margin:auto;text-align:center;background-color:lightgray;">
	<c:forEach var="product" items="${list}">
		<tr>
			<td>選手${product.id}</td>
			<td><img src="img/${product.id}.jpg" height="64"></td>
			<td>${product.name}</td>
			<td>${product.price}円</td>
			<td><a href="CartAdd.action?id=${product.id}">仮契約</a></td>
		</tr>
	</c:forEach>
</table>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

<%@include file="footer.jsp" %>