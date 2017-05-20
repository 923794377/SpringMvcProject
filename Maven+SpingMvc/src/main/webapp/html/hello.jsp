<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/6
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<html>
<head>
    <title></title>
</head>
<body>
<h1>${message}</h1>
<a href="${ctx}/userList" style="color: red">用户列表</a>
</body>
</html>
