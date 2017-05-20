
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>
<div class="container">
  <h1>SpringMVC 添加用户</h1>
  <hr/>
  <form:form action="${ctx}/addUserPost" method="post" commandName="user" role="form">
    <div class="form-group">
      <label for="userName">UserName:</label>
      <input type="text" class="form-control" id="userName" name="userName" placeholder="Enter UserName:"/>
    </div>
    <div class="form-group">
      <label for="pass">PassWord:</label>
      <input type="text" class="form-control" id="pass" name="pass" placeholder="Enter PassWord:"/>
    </div>
    <div class="form-group">
      <button type="submit" class="btn btn-sm btn-success">提交</button>
    </div>
  </form:form>
</div>

<h1>${message}</h1>
</body>
</html>
