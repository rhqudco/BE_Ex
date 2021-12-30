<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf-8");
            String answer = request.getParameter("answer");

            // 서울이면 pass.jsp
            if(answer.equals("서울")) {
                response.sendRedirect("pass.jsp");
            }
            else {
                response.sendRedirect("fail.jsp");
            }
            // 아니면 fail.jsp
        %>
    </body>
</html>