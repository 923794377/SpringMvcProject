<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/1/6
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
  <h2 style="color: blue">欢迎查看</h2>
  <span>ID:</span> <span>${user.id}</span><br>
  <span>time:</span> <span>${user.createTime}</span><br>
  <span>isdelete:</span> <span>${user.isdelete}</span><br>
  <span>userName:</span> <span>${user.userName}</span><br>
  <span>passWord:</span> <span>${user.passWord}</span><br>

</body>
</html>
