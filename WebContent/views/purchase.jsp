<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>
<div style="margin:auto;text-align:center;font-weight:bold;">
	<p>${cart.size()}人の選手と仮契約しています</p>
</div>
<hr>

<table style="border-collapse:separate;border-spacing:10px;border:solid;
	margin:auto;text-align:center;background-color:lightgray;width:700px;">
<c:forEach var="item" items="${cart}">
	<tr>
	<td>選手${item.product.id}</td>
	<td><img src="img/${item.product.id}.jpg" height="96"></td>
	<td>${item.product.name}</td>
	<td>${item.product.price}円</td>
	<td>${item.count}年</td>
	<td><a href="CartRemove.action?id=${item.product.id}">カートから削除</a></td>
	</tr>
</c:forEach>
</table>
<hr>
<div style="margin:auto;text-align:center;background-color:lightgray;border:solid;width:700px;">
	<form action="Purchase.action" method="post">
	<p>お名前<input type="text" name="name"></p>
	<p>契約方法<input type="text" name="agreement"></p>
	<p><input type="submit" value="契約確定"></p>
	</form>
</div>
<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

<%@include file="footer.jsp" %>
