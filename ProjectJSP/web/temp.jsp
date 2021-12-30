<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
    JSP 환영합니다 <br><br>

    <%
        out.println("JSP를 시작합니다.");
    %>
    <br> 여기는 HTML 영역
    <%
        out.println("<br>JSP를 시작합니다.");
    %>
    </body>
</html>
