<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
      // request -> session -> application
      session.setAttribute("name", "세션");
      request.setAttribute("name", "request");
      application.setAttribute("name", "애플리케이션");
    %>
  <jsp:forward page="scope-priority-result.jsp" />
  </body>
</html>