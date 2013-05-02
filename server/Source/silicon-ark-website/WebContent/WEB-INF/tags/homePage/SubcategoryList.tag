<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="categoryId" required="true" rtexprvalue="true" %>
<%@ attribute name="id" required="true" rtexprvalue="true"%>
<%@ attribute name="cssClass" rtexprvalue="true"%>
<%@ taglib prefix="cms" tagdir="/WEB-INF/tags" %>
<%@ tag import="silicon.cms.runtime.service.CategoryRuntimeManager"  %>
<%@ tag import="silicon.cms.common.entity.SubCategoryEntity"%>
<%@ tag import="java.util.List"%>
<%@ tag import="silicon.common.util.StringUtil" %>
<%@ attribute name="openInNewWindow" rtexprvalue="true" type="java.lang.Boolean"%>
<%
	CategoryRuntimeManager manager = CategoryRuntimeManager.getInstance();
	List<SubCategoryEntity> subs = null;
	if(StringUtil.notNullOrEmpty(categoryId))
	{
		subs = manager.getSubCategory(categoryId);
	}
	
	int count = 0;
%>

<ul id="${id}" class="${cssClass}">
<% for(SubCategoryEntity entity : subs) {%>

<li id="<%= entity.getId() %>">
	<a href="">
	  <%= entity.getSubCategoryName()%>
	</a>
</li>

<% if(count == 1 || count == 4 || count == 6 || count == 9 || count == 11){%>
		<li id="temp"></li>
<% } %>

<% count++; } %>
</ul>