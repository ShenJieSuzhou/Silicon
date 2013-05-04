<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag import="java.util.List" %>
<%@ tag import="java.util.ArrayList"%>
<%@ tag import="silicon.common.util.StringUtil"%>
<%@ tag import="silicon.cms.common.entity.GoodsEntity"%>
<%@ tag import="silicon.cms.runtime.service.PostRuntimeManager"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage" %>
<%@ attribute name="id" rtexprvalue="true"%>
<%@ attribute name="categoryId" rtexprvalue="true"%>
<%@ attribute name="subcategoryId" rtexprvalue="true"%>
<%@ attribute name="cssClass" rtexprvalue="true"%>
<%@ attribute name="openInNewWindow" rtexprvalue="true" type="java.lang.Boolean"%>
<%@ attribute name="displayPageNavigationBar" rtexprvalue="true" type="java.lang.Boolean"%>
<%@ attribute name="displayAll" rtexprvalue="true" type="java.lang.Boolean"%>
<%@ attribute name="pageSize" rtexprvalue="true" type="java.lang.Integer"%>
<%@ attribute name="pageIndex" rtexprvalue="true" type="java.lang.Integer"%>

<%
if(pageIndex == null)
{
	pageIndex = 0;
}
if(pageSize == null)
{
	pageSize = 0;
}
if(displayPageNavigationBar == null)
{
	displayPageNavigationBar = (pageSize > 0);	
}
if (openInNewWindow == null)
{
	openInNewWindow = false;
}

PostRuntimeManager manager = PostRuntimeManager.getInstance();
List<GoodsEntity> posts = null;
if(StringUtil.notNullOrEmpty(subcategoryId))
{
	
}
else if(StringUtil.notNullOrEmpty(categoryId))
{
	
}
else if(displayAll)
{
	posts = manager.loadAllPosts(pageIndex, pageSize);
}
%>
<ul id="${id}" class="${cssClass}">
<% for(GoodsEntity goods : posts) {%>
<li id="<%= goods.getId()%>">
	<a href="<%= goods.getLink()%>"  <%= openInNewWindow ? "target='_blank'" : ""%> title="<%= goods.getTitle()%>">
		<img src='<%= goods.getPhotoURL() %>'/>
		<div id="title"><%= goods.getTitle() %></div>
		<div id="price"><%= goods.getPrice() %></div>
	</a>
</li>
<%} %>
</ul>
<% if(displayPageNavigationBar) {%>
<SC:PageNavigationBar id="pageNavigationBar" pageIndex="<%= pageIndex%>" pageSize="<%= pageSize%>" displayNextButton="<%= posts.size() == pageSize%>"/>
<%} %>





