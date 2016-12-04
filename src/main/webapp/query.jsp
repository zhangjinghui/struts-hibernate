<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>My JSP 'query.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<form>
		<table>
			<tr>
				<td>用户名：</td>
				<td>密码：</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${requestScope.list }" var="user">
				<tr>
					<td>${user.username }</td>
					<td>${user.password }</td>
					<td><a href="user!del?id=${user.id }">删除</a> <a href="user!querybyid?id=${user.id }">修改</a></td>
				</tr>
			</c:forEach>
		</table>
	</form>

</body>
</html>
