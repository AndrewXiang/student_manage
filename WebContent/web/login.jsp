<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head><title>学生成绩管理系统</title></head>
	<body bgcolor="#FFFFFF" style="margin-top:15%">
	<center>
		<s:form action="login.action" method="post">
				<tr><td width="40">学号</td>
					<td><input type="text" name="dl.xh" /></td>
				</tr>
				<tr><td width="40">口令</td>
					<td><input type="text" name="dl.kl" /></td>
				</tr>
				<tr>
					<td cols="2">
						<input type="submit" value="登录" />
						<input type="reset" value="重置" />
					</td>
				</tr>
		</s:form>
		</center>
	</body>
</html>
