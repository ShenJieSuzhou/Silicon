<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="silicon.cms.common.factory.DAOFactory" %>
<%@ page import="silicon.cms.common.dao.CategoryDAO"%>
<%@ page import="java.util.List" %>
<%@ page import="silicon.cms.common.entity.CategoryEntity" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>谢耳朵的鲜花</title>
<link href="/static/common/css/common.css" rel="stylesheet"></link>
<link href="/static/common/css/home.css" rel="stylesheet"></link>

</head>
<body>
<div id="header">
	<div id="container">
		<div id="logo">
			<a href=""><img src="/static/common/images/homelogo.png" title="谢耳朵的小店"/></a>
		</div>
		<div id="cursor">
			<img src="/static/common/images/2bname.png" />
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

<div id="content">
	<div id="sideBar">
		<div id="flowers">
			<p>按产品选购</p>

		</div>
		<div id="festival">
			<p>按节日选购</p>
		</div>
		<div id="occasion">
			<p>按场合选购</p>
		</div>
	</div>
</div>

<div id="footer">
	<ul id="detail">
		<li><a href="">关于我们</a></li>
		<li><a href="">招贤纳士</a><li>
		<li><a href="">网站地图</a></li>
		<li><a href="">@新浪微博</a></li>
		<li><a href="">广告联系</a></li>
	</ul>
</div>

</body>
</html>