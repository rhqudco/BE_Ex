<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%
        int num = Integer.parseInt(request.getParameter("num"));
        out.print("<table border=1>");
        out.print("<th colspan=3>" + num + "단</th>");
        for(int i = 1; i < 10; i++) {
            out.print("<tr>" +
                    "<td>" + num + "</td>" +
                    "<td>" + i + "</td>" +
                    "<td>" + num*i + "</td>" +
                    "</tr>");
        }
        out.print("</table>");
    %>
  </body>
</html>