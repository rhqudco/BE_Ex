<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>expression.jsp 표현식 예제</title>
  </head>
  <body>
    <%!
        int add(int a, int b) {
            return a+b;
        }
        int x = 10;
        int y = 20;
    %>
    x = <%= x %><br>
    y = <%= y %><br>
    add(x, y) = <%= add(x, y) %><br>
  </body>
</html>