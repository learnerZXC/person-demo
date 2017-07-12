<%@ page language="java" pageEncoding="UTF-8" %>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>登陆</title>
<link type="text/css" rel="stylesheet" href="../style/reset.css">
<link type="text/css" rel="stylesheet" href="../style/main.css">
</head>

<body>
<div class="headerBar">
	<div class="logoBar login_logo">
		<div class="comWidth">
			<div class="logo fl">
				<a href="#"><img src="../images/logo.jpg" alt="慕课网"></a>
			</div>
			<h3 class="welcom_title">欢迎登陆</h3>
		</div>
	</div>
</div>

<div class="loginBox">
	<div class="login_cont">
		<ul class="login">
			<form action="${pageContext.request.contextPath}/person/doLogin" method="post">
				<li class="l_tit">邮箱/用户名/手机号</li>
				<li class="mb_10"><input type="text" name="userName" class="login_input user_icon"></li>
				<li class="l_tit">密码</li>
				<li class="mb_10"><input type="password" name="password" class="login_input user_icon"></li>
				<li class="autoLogin"><input type="checkbox" id="a1" class="checked"><label for="a1">自动登陆</label></li>
				<li><input type="submit" value="登陆" class="login_btn"></li>
			</form>
		</ul>
		<div class="login_partners">
			<p class="l_tit">使用合作方账号登陆网站</p>
			<ul class="login_list clearfix">
				<li><a href="#">QQ</a></li>
				<li><span>|</span></li>
				<li><a href="#">网易</a></li>
				<li><span>|</span></li>
				<li><a href="#">新浪微博</a></li>
				<li><span>|</span></li>
				<li><a href="#">腾讯微博</a></li>
			</ul>
		</div>
	</div>
	<a class="reg-link" href="#"></a>
</div>

<div class="hr_25">
	<div class="footer">
		<p><a href="#">慕课简介</a><i>|</i><a href="#">慕课公告</a><i>|</i><a href="#">招贤纳士</a><i>|</i><a href="#">联系我们</a><i>|</i><a href="#">客服热线：400-1234-5678</a></p>
		<p>Copyright &copy; 2006 - 2014 慕课版权所有&nbsp;&nbsp;&nbsp;京ICP备09037834号&nbsp;&nbsp;&nbsp;京ICP证B1034-8373号&nbsp;&nbsp;&nbsp;某市公安局XX分局备案编号：1234524154</p>
		<p class="web"><a href="#"><img alt="logo" src="../images/webLogo.jsp"></a></p>
	</div>
</div>
</body>
</html>