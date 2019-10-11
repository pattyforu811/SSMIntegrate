<%--
  Created by IntelliJ IDEA.
  User: msi-
  Date: 2019/10/9
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>查询所有账户</h3>
${accounts}<br>
<c:forEach items="${accounts}" var="account">
    ${account.name}
    ${account.money}
</c:forEach>
</body>
</html>
