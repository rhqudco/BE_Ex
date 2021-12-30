<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("utf-8");
            // 아이디를 입력하지 않았으면 login.jsp 페이지로 포워딩
            String user_id = request.getParameter("user_id");
            if(user_id.length() == 0) {
        %>
        <jsp:forward page="login.jsp"/>
        <%
            }
        %>
    <h2>환영합니다 <%= user_id%> 님!</h2>
    </body>
</html>
