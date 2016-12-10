<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">

<title>调用数据库的测试</title>
<meta charset="UTF-8">
<meta name="Generator" content="SublimeText3®">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">

<script type="text/javascript" src="/dist/js/jquery.js"></script>
<script type="text/javascript" src="/dist/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="/dist/css/bootstrap.css">
<style type="text/css">
	.mydiv{
	float: left;
	padding-left: 20px;
	}
</style>
</head>
<body>
	<c:forEach items="${requestScope.infoes}" var="com">
<div class="mydiv">
  <div class="col-lg-2">
    <div class="thumbnail">
      <div class="caption">
        <h3>${com.commodityName}</h3>
        <p><img  alt="六安瓜片" src="${com.commodityImage}" width="120" height="90"></p>
        <p><a href="#" class="btn btn-primary" role="button">Button</a> <a href="#" class="btn btn-default" role="button">Button</a></p>
      </div>
    </div>
  </div>
</div>
	</c:forEach>
	
</body>
</html>
