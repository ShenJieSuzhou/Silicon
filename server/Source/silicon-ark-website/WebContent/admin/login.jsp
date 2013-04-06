<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<SC:CoolFrame/>
<title>Silicon 方舟登录</title>
<link href="login/css/security.css" rel="stylesheet"></link>
</head>
<body>
	<div id="loginPane">
		<div id="logo">
			<img src="login/images/logo.png"/>
		</div>	
		<div id="board">
			<ul id="login">
				<li id="user"></li>
				<li id="pwd"></li>
				<li id="signin"></li>
			</ul>
		</div>
		<div id="forgetPwd"><a href="">忘记密码</a></div>
	</div>
</body>
</html>