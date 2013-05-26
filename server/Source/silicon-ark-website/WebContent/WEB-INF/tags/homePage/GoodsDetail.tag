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
<div id="wall">
<div id="photo"><img src='<%= goods.getPhotoURL()%>'/></div>
<h1 id="title"><%= goods.getTitle() %></h1>
<% if(goods.getPrice() != null) {%>
<div id="price"><span id="hinder">价格：</span><%= goods.getPrice()%></div>
<%} %>
<% if(goods.getSummary() != null){%>
<div id="summary"><span id="hinder">花语：</span><%= goods.getSummary() %></div>
<%} %>
<div id="logistics">
	<div id="areas">
		<span id="hinder">配送：</span>
		<select>
			<option>苏州</option>
			<option selected="selected">南京</option>
			<option>上海</option>
			<option>深圳</option>
		</select>
	</div>
</div>
<div id="number"><span id="hinder">数量：</span><input id="num"/></div>
<a href="#"><div id="purchase"><span id="ohyeah">立即购买</span></div></a>
<a href="#"><div id="cart"><span id="add">加入购物车</span></div></a>
</div>
<% if(goods.getContentText() != null) {%>
<div id="content"><%= goods.getContentText()%></div>
<%} %>
</div>