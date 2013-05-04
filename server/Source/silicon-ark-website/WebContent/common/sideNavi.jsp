<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage" %>
<%
request.setCharacterEncoding("utf-8");
%>
<div id="sideBar">
		<div id="flowers">
			<p>按产品选购</p>
			<SC:SubcategoryList id="flowerTag" categoryId="STC00000000000000000000000000003"/>
		</div>
		<div id="festival">
			<p>按节日选购</p>
			<SC:SubcategoryList id="festivalTag" categoryId="STC00000000000000000000000000001"/>
		</div>
		<div id="occasion">
			<p>按场合选购</p>
			<SC:SubcategoryList id="occasionTag" categoryId="STC00000000000000000000000000002"/>
		</div>
</div>