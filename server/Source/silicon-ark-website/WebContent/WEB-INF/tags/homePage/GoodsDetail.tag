<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ tag import="silicon.cms.common.entity.GoodsEntity" %>
<%@ tag import="silicon.cms.runtime.service.PostRuntimeManager" %>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/homePage"%>
<%@ attribute name="id" required="true" rtexprvalue="true" %>
<%@ attribute name="postId" rtexprvalue="true" %>
<%@ attribute name="categoryId" rtexprvalue="true" %>

<%
PostRuntimeManager manager = PostRuntimeManager.getInstance();
GoodsEntity goods = manager.getGoods(postId, categoryId);
%>
<div id="<%= id%>" class="goodsDetail">
<h1 id="title"><%= goods.getTitle() %></h1>
<% if(goods.getSummary() != null){%>
<div id="summary"><%= goods.getContentText() %>></div>
<%} %>
</div>