<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html>
<head>
	<title>新建</title>
	<link type="text/css" rel="stylesheet" href="../style/backstage.css">
</head>
	
<body>
	<jsp:include page="header.jsp"/>
	<div class="content clearfix">
		<div class="main">
		<div class="cont">
			<table style="margin-left: 30px; margin-top: 30px">
				<form action="${pageContext.request.contextPath}/person/addPerson" method="post">
					<tr height="30px">
						<td>姓名：</td><td><input type="text" value="" name="name" style="background:gray; height:20px"></td>
					</tr>
					<tr height="30px">
						<td>电话：</td><td><input type="text" value="" name="phone" style="background:gray; height:20px"></td>
					</tr>
					<tr height="30px">
						<td>地址：</td><td><input type="text" value="" name="address" style="background:gray; height:20px"></td>
					</tr>
					<tr height="30px">
						<td align="center" colspan="2"><input type="submit" value="提交" class="mybtn"/></td>
					</tr>
			</table>
		</div>
		</div>
		<jsp:include page="navigator.jsp"/>
	</div>
</body>
	
</html>