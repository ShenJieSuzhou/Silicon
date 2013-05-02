<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>谢耳朵的鲜花</title>
</head>
<link href="/static/common/css/main.css" rel="stylesheet"></link>
<body>

<SC:Header/>

<div id="content">
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
	<div id="product">
	</div>
</div>

<SC:Footer/>

</body>
</html>