<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript" src="/dist/js/jquery.js"></script>
<script type="text/javascript" src="/dist/js/bootstrap.js"></script>
<link rel="stylesheet" type="text/css" href="/dist/css/bootstrap.css">
</head>

<body>
	<div class="page-header">
		<h1>
			cosy IT<small>---致力于为人类提供令人舒适IT服务，创造当下人类方便舒适的美好的生活！</small>
		</h1>
	</div>
	<hr>
	<div class="jumbotron">
		<h2>cosyIT组织成员的你， 欢迎您进入全栈工程师的强者之路!</h2>
		<p></p>
		<p>
			<a href="/liuyichadao/lycd/crol/TeaCommodityaction/getinfo">开始数据库测试</a>
		</p>
			<p>
			<a href="/liuyichadao/tea1.jsp">子页之-tea1页面</a>
		</p>	
	</div>

</body>
</html>
