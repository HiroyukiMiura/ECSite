<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="header.jsp" %>
<%@include file="menu.jsp" %>

<header style="background-color:lightblue;">
	<img src="http://localhost:8080/ShoppingSite/img/npb.png" alt="NPB">
</header>

<div style="margin:auto;text-align:center;">
<c:choose>
	<c:when test="${cart.size()>0}">
		<p>${cart.size()}人の選手がいます</p>
		<hr>
	</c:when>
	<c:otherwise>
		<p>仮契約中の選手はいません</p>
	</c:otherwise>
</c:choose>
</div>

<table style="border-collapse:separate;border-spacing:10px;
	margin:auto;text-align:center;background-color:lightgray;">
<c:forEach var="item" items="${cart}">
	<tr>
	<td>選手${item.product.id}</td>
	<td><img src="img/${item.product.id}.jpg" height="96"></td>
	<td>${item.product.name}</td>
	<td>年俸${item.product.price}円</td>
	<td>${item.count}年</td>
	<td><a href="CartRemove.action?id=${item.product.id}">カートから削除</a></td>
	</tr>
</c:forEach>
</table>

<footer style=background-color:lightgreen;>
<p style="margin:auto;text-align:center;height:131px;">Copyright 2021 Hiroyuki Miura</p>
</footer>

<%@include file="footer.jsp" %>