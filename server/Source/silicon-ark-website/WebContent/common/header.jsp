<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags" %>
<%
request.setCharacterEncoding("utf-8");
%>
<link href="/static/common/css/common.css" rel="stylesheet"></link>
<link href="/static/common/css/home.css" rel="stylesheet"></link>
<script src = "/static/common/scripts/lib/jquery.min.js" type = "text/javascript"></script>
<link href="/static/common/css/main.css" rel="stylesheet"></link>
<link href="/static/common/css/more.css" rel="stylesheet"/>
<script src="/static/common/scripts/src/jquery.pear.js" type="text/javascript"></script>

<div id="header">
	<div id="container">
		<div id="logo">
			<a href=""><img src="/static/common/images/homelogo.png" title="谢耳朵的小店"/></a>
		</div>
		<div id="cursor">
			<img src="/static/common/images/sbname.png" />
		</div>
		<div id="searchBar">
			<form id="search" meathod="post">
				<fieldset>
   					<input id="input_search" type="text" name="keyWords" value="搜索您想要的鲜花吧" 
   						autocomplete="off" onfocus="if(value=='搜索您想要的鲜花吧'){  value='' }" 
   						onblur="if(value==''){ value='搜索您想要的鲜花吧' } "			
   					/>
   					<input id="input_submit" type="image" src="/static/common/images/search1.gif" title="搜索"/>
				</fieldset>		
			</form>
		</div>
		<div id="verification">
			<p><a href="">登录</a> / <a href="">注册</a></p>
		</div>
		<div id="social">
			<ul id="socialIcon">
				<li><a href="https://twitter.com/i/#!/welcome"><img src="/static/common/images/fb.png"/></a></li>
				<li><a href="https://twitter.com/i/#!/welcome"><img src="/static/common/images/twitter.png"/></a></li>
				<li><a href="https://twitter.com/i/#!/welcome"><img src="/static/common/images/share.png"/></a></li>
			</ul>
		</div>
	</div>
</div>