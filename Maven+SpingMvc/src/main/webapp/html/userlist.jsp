<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/6
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户表</title>
</head>
<body>
<table border="1">
    <tr>
        <th align="left">ID</th>
        <th>用户名</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="lists">
        <tr>
            <td align="left">${lists.id}</td>
            <td>${lists.userName}</td>
            <td><a href="/chankan?id=${lists.id}">查看 | <a href="/deleteuser?id=${lists.id}">删除  | <a href="/updatauser?id=${lists.id}">修改</a></a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
