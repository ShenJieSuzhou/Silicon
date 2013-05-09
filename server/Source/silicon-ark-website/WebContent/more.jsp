<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage/"%>

<%
String categoryId = request.getParameter("categoryId");
String subCategoryId = request.getParameter("subcategoryId");

%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/static/common/css/more.css" rel="stylesheet"/>
<SC:Header/>
<div id="content">
	<SC:sideNavi></SC:sideNavi>
	<div id="product">
		<SC:GoodsList id="apple" cssClass="pear" subcategoryId="<%= subCategoryId%>" categoryId="<%= categoryId%>" pageIndex='<%= Integer.parseInt(request.getParameter("pageIndex")) - 1%>' pageSize="9"/>
		<script>
		    $("#apple")
		        .pear({
		            cellWidth: 200,
		            cellHeight: 268,
		            padding: 10
		        })
		        .height(270 * 3).css("margin-left", 20);
		 </script>
	</div>
</div>
<SC:Footer/>
</head>
<body>

</body>
</html>