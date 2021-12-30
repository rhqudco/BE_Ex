<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
   <%
       String width = request.getParameter("width");
       String height = request.getParameter("height");
       int area = Integer.parseInt(width) * Integer.parseInt(height);
       out.print("<h1>넓이는 " + area + "m^2 입니다.</h1>");
   %>
  </body>
</html>