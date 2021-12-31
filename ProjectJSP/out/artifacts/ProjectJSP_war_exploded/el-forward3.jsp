<%@ page import="main.StudentBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <%
            StudentBean student1 = new StudentBean("2001003", "이몽룡", "010", "서울시 강남구", "4학년");
            StudentBean student2 = new StudentBean("2001001", "홍길동", "010", "서울시 강남구", "3학년");
            StudentBean student3 = new StudentBean("2001002", "성춘향", "010", "서울시 강남구", "2학년");

            List studentList = new ArrayList();
            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);

            request.setAttribute("stdList", studentList);
        %>
        <jsp:forward page="el-forward-result3.jsp" />
    </body>
</html>