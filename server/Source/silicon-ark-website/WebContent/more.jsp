<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="silicon.cms.common.entity.SubCategoryEntity" %>
<%@ page import="silicon.cms.common.entity.CategoryEntuty" %>
<%@ page import="silicon.cms.runtime.service.CategoryRuntimeManager" %>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage/"%>

<%
String categoryId = request.getParameter("categoryId");
String subCategoryId = request.getParameter("subcategoryId");
if(subCategoryId != null && subCategoryId.equals(""))
{
	subCategoryId = null;
}

SubCategoryEntity subcategory = null;
if(subCategoryId != null)
{
	subcategory = CategoryRuntimeManager.getInstance().getSubCategory(m_CategoryId);
	if(subcategory == null)
	{
		response.setStatus(404);
		return;
	}
}
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
		<SC:GoodsList id="apple" cssClass="pear" subcategoryId="<%= subcategoryId%>" categoryId="<%= categoryId%>" pageIndex='<%= Integer.parseInt(request.getParameter("pageIndex")) - 1%>' pageSize="20"/>
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
</head>
<body>

</body>
</html>