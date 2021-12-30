<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>login</title>
    </head>
    <body>
<%--        <%--%>
<%--            String user_id = request.getParameter("user_id");--%>
<%--            // 값이 null인경우 출력은 되지만 null로 무언가 하려고 하면 NullPointerException 출력--%>
<%--        %>--%>
<%--        <%= user_id %>--%>
        <%
            String user_id = request.getParameter("user_id");
            if(user_id == null) {
        %>
        <h2 name="h2login">로그인</h2>
        <%
            } else {
        %>
        <h2>아이디를 입력하지 않았습니다. 아이디를 입력해 주세요.</h2>
        <%
            }
        %>
        <form name="frmLogin" method="post" action="loginResult.jsp" >
        아이디  :<input type="text" name="user_id"><br>
        비밀번호:<input type="password" name="user_pw" ><br>
        <input type="submit" value="로그인">  <input type="reset" value="다시입력">
        </form>
    </body>
</html>
