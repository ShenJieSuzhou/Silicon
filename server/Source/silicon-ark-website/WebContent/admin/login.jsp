<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="SC" tagdir="/WEB-INF/tags/admin/"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<SC:CoolFrame/>
<script>
$import("pt.cms.admin.security.page.LoginPageController");
</script>

<script>
var pageController = new pt.cms.admin.security.page.LoginPageController();
</script>

<title>Silicon 方舟登录</title>
</head>
<body>
	<div id="loginPane">
		<div id="logo">
			<img src="images/logo.png"/>
		</div>	
		<div id="board">
			<form id="security" method="post" action="${pageContext.request.contextPath}/api/0/security/login" enctype="application/x-www-form-urlencoded">
				<ul id="login">
					<li id="user"><input id="userName" type="text" name="loginName" /></li>
					<li id="pwd"><input id="psw" type="password" name="password" /></li>
					<li id="signin">
						<input type="hidden" name="redirectURL" value="${param.redirectURL}" />
        				<input id="loginButton" type="submit" value=""/>
        			</li>
				</ul>
			</form>
		</div>
		<div id="forgetPwd"><a href="">忘记密码</a></div>
	</div>
</body>
</html>