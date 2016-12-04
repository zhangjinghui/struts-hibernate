<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
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
  	<c:if test="${requestScope.user.id==null }">
  		<h2>增加用户</h2>
  	</c:if>
    <c:if test="${requestScope.user.id!=null }">
  		<h2>修改用户</h2>
  	</c:if>
  	
  	
    <form action="user!add" method="post">
    	<td>
    		<input type="hidden" name="user.id" value="${requestScope.user.id }"/>
    		用户名：<input type="text" name="user.username" value="${requestScope.user.username }"/>
    		密码：<input type="text" name="user.password" value="${requestScope.user.password }"/>
    		<input type="submit" value="提交"/>
    	</td>
    </form>
  </body>
</html>
