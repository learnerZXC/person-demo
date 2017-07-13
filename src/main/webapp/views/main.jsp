<%@ page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>登陆</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
</head>
<body>
	<jsp:include page="header.jsp"/>

    <div class="tabbable tabs-left">
	  <ul class="nav nav-tabs">
		<li class="active"><a href="#lA" data-toggle="tab">人员列表</a></li>
	    <li><a href="#2A" data-toggle="tab">新增人员</a></li>
	    <li><a href="#3A" data-toggle="tab">Section 3</a></li>
	  </ul>
	  <div class="tab-content">
		  <div class="tab-pane active" id="lA">
		  	<table class="table table-striped table-hover">
				<thead>
					<tr>
						<th class="col-md-2" style="text-align:center;">姓名</th>
						<th class="col-md-4" style="text-align:center;">电话</th>
						<th class="col-md-4" style="text-align:center;">地址</th>
						<th class="col-md-2" style="text-align:center;">操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="p" items="${persons}">
						<tr>
							<td style="text-align:center;">${p.name}</td>
							<td style="text-align:center;">${p.phone}</td>
							<td style="text-align:center;">${p.address}</td>
							<td style="text-align:center;">
								<a class="btn" href="${pageContext.request.contextPath}/person/updatePrompt?id=${p.id}">修改</a>
								<a class="btn" href="${pageContext.request.contextPath}/person/deletePersonById?id=${p.id}" onclick='return confirm("确定要删除吗")'>删除</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		  </div>
		  <div class="tab-pane" id="2A">
		    <div>
				<form class="form-horizontal" action="${pageContext.request.contextPath}/person/addPerson" method="post">
					<div class="control-group">
					    <label class="control-label" for="name">姓名：</label>
					    <div class="controls">
					      <input type="text" id="name" name="name" placeholder="姓名">
					    </div>
					</div>
					<div class="control-group">
						<label class="control-label" for="phone">电话：</label>
						<div class="controls">
							<input type="text" id="phone" name="phone" placeholder="电话">
						</div>
					</div>
					<div class="control-group">
						<label class="control-label" for="address">地址：</label>
						<div class="controls">
							<input type="text" id="address" name="address" placeholder="地址">
						</div>
					</div>
					<div class="control-group">
						<div class="controls">
							<button type="submit" class="btn">提交</button>
						</div>
					</div>
				</form>
			</div>
		  </div>
		  <div class="tab-pane" id="3A">
		    <p>What up girl, this is Section C.</p>
		  </div>
	</div>
    </div>
	
	

	<script src="http://code.jquery.com/jquery.js"></script>
	<script src="../js/bootstrap.min.js"></script>
</body>
</html>