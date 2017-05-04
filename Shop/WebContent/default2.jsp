<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>cookie测试</title>
</head>
<body>
	<%
		String welcome = "第一次访问";
		String[] info = new String[] { "", "", "" };
		Cookie[] cook = request.getCookies();
		if (cook != null) {
			for (int i = 0; i < cook.length; i++) {
				if (cook[i].getName().equals("mrCookInfo")) {
					info = cook[i].getValue().split("#");
					welcome = "，欢迎回来";
				}
			}
		}
	%>
	<%=info[0] + welcome%>
	<form action="show2.jsp" method="post">
		<ul style="">
			<li>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<input
				name="name" type="text" value="<%=info[0]%>" /></li>
			<br />
			<li>出生日期：<input name="birthday" type="text" value="<%=info[1]%>" /></li>
			<br />
			<li>邮箱地址：<input name="mail" type="text" value="<%=info[2]%>" /></li>
			<br />
			<li><input type="submit" value="提交" /></li>
		</ul>
	</form>

</body>
</html>