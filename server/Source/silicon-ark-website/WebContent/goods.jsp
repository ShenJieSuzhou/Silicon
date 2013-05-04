<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="silicon.cms.common.entity.GoodsEntity" %>
<%@ page import="silicon.cms.runtime.service.PostRuntimeManager" %>    
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage" %>

<%
String id = request.getParameter("id");
String categoryId = request.getParameter("categoryId");
PostRuntimeManager manager = PostRuntimeManager.getInstance();
GoodsEntity goods = null;

if(categoryId.equals("search"))
{
}
else
{
	goods = manager.getGoods(id, categoryId);
}
if(goods == null)
{
	response.setStatus(404);
	return null;
}

%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/static/common/css/goods.css" rel="stylesheet"></link>
</head>
<body>
<SC:Header path="<%= categoryId %>"/>
	<div id="content">
		<SC:sideNavi></SC:sideNavi>
	<div id="product">
		<SC:GoodsDetail id="goodsDetail" postId="<%= id %>" categoryId="<%= categoryId%>"/>
	</div>
</div>
<SC:Footer path="<%= categoryId %>"/>
</body>
</html>