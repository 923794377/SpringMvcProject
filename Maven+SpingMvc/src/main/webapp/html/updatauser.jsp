<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/6
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title></title>
</head>
<body>
<form:form action="/savauserupdata" method="post" commandName="baseUser"   id="sava">
    <input name="passWord" type="text" value=${user.passWord}>
    <input name="userName" type="text" value="${user.userName}">
    <input type="hidden" name="id" value="${user.id}"/>
    <a href="#" onclick="document.getElementById('sava').submit();">保存</a>
</form:form>
</body>
</html>
