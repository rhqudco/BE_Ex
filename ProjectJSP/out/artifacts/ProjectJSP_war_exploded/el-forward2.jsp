<%@ page import="main.StudentBean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
        StudentBean student = new StudentBean("2001003", "이몽룡", "010", "서울시 강남구", "4학년");
        request.setAttribute("student", student);
    %>
  <jsp:forward page="el-forward-result2.jsp" />
  </body>
</html>