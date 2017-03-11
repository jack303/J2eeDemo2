<%--
  Created by IntelliJ IDEA.
  User: localdomain
  Date: 2017/3/10
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Welcome to login: ${sessionScope.get("user").email}
</body>
</html>
