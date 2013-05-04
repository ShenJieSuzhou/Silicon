<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage" %>
<% 
	String pageIndex = request.getParameter("pageIndex");
	if(pageIndex == null)
	{
		pageIndex = "1";
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>谢耳朵的鲜花</title>
</head>
<script src = "/static/common/scripts/lib/jquery.min.js" type = "text/javascript"></script>
<link href="/static/common/css/main.css" rel="stylesheet"></link>
<link href="/static/common/css/more.css" rel="stylesheet"/>
<script src="/static/common/scripts/src/jquery.pear.js" type="text/javascript"></script>
<body>

<SC:Header/>

<div id="content">
	<SC:sideNavi></SC:sideNavi>
	<div id="product">
		<SC:GoodsList id="apple" cssClass="pear" displayAll="true" pageIndex='<%= Integer.parseInt(pageIndex) - 1%>' pageSize="20"/>
		<script>
		    $("#apple")
		        .pear({
		            cellWidth: 180,
		            cellHeight: 268,
		            padding: 10
		        })
		        .height(270 * 3).css("margin-left", 20);
		 </script>
	</div>
</div>

<SC:Footer/>

</body>
</html>