<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <c:redirect url="c_redirect_result.jsp">
            <c:param name="name" value="${'HongGilDong'}"/>
            <c:param name="email" value="${'hong@test.com'}"/>
        </c:redirect>
    </body>
</html>