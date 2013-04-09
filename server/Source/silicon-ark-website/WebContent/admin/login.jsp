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
	<div id="register">
		<a href="#"><img id="reg" src="login/images/register.png" title="注册"/></a>
	</div>
	<div id="loginPane">
		<div id="logo">
			<img src="login/images/logo.png"/>
		</div>	
		<div id="board">
			<form id="security" method="post" action="${pageConetxt.request.contextPath}/api/0/security/login">
				<ul id="login">
					<li id="user"><input id="userName" type="text" name="loginName"/></li>
					<li id="pwd"><input id="psw" type="password" name="password" /></li>
					<li id="signin">
						<input type="hidden" name="redirectURL" value="${param.redirectURL}"/>
        				<input  id="loginButton" type="submit" value=""/>
        			</li>
				</ul>
			</form>
		</div>
		<div id="forgetPwd"><a href="">忘记密码</a></div>
	</div>
</body>
</html>