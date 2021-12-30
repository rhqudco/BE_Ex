<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    String name = "홍길동";
%>
<html>
    <head>
        <title>include.jsp</title>
    </head>
    <body>
        <%-- top --%>
        이 부분에 top.jsp 내용이 포함될 것입니다.<p>
        <%@ include file="top.jsp" %>
        <hr>
        <%-- 본문 --%>
        <h3>본문</h3>
        이 부분은 include.jsp의 내용입니다.
        <hr>
        <%-- bottom --%>
        이 부분에 bottom.jsp 내용이 포함될 것입니다.<p>
        <%@ include file="bottom.jsp" %>
    </body>
</html>