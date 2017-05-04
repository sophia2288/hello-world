<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>跳转到本页面</title>
</head>
<body>
	<form action="default.jsp" method="post">
		<table align="center">
			<tr>
				<td align="center" colspan="2">
					<h3>添加用户</h3>
				</td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input name="userName" type="text" /></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td>
					<input name="sex" type="radio" value="男" checked="checked" />
					<input name="sex" type="radio" value="女" />
				</td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<input type="submit" value="添加" />
					<input type="reset" value="重置" />
				</td>
			</tr>
		</table>
	</form>
	<a href="show.jsp?id=001&name=wuhongxing">获取请求参数的值</a>
</body>
</html>