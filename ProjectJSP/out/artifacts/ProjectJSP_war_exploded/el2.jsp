<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="main.StudentBean" scope="page">
    <jsp:setProperty name="student" property="stdName" value="홍길동" />
</jsp:useBean>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <jsp:getProperty name="student" property="stdName" />
    ${student.stdName}
  </body>
</html>
