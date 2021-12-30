<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Date date = new Date();
%>
<html>
    <head>
        <title>top.jsp</title>
    </head>
    <body>
        <font color='blue' size="3pt">
            top.jsp 입니다.<p>
            <%= date.toLocaleString() %>
    </body>
</html>
