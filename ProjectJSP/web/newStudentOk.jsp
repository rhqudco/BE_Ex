<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>폼에 입력한 값으로 빈 속성값 한번에 설정</title>
  </head>
  <body>
    <%
        request.setCharacterEncoding("utf-8");

    %>
<%--  StudentBean 사용 / 모든 프로퍼티에 값 설정--%>
    <jsp:useBean id="student" class="main.StudentBean" scope="page">
        <jsp:setProperty name="student" property="*" />
    </jsp:useBean>
<%--  앞에 Form 태그 안의 input태그에서 name 속성값과 StudentBean 클래스의 멤버 필드 명이 동일해야 함--%>
  <h3>학생 정보 출력(Bean 속성 값 출력)</h3>
    학번 : <%= student.getStdNo() %> <br>
    이름 : <%= student.getStdName() %> <br>
    연락처 : <%= student.getStdPhone() %> <br>
    주소 : <%= student.getStdAddress() %> <br>
    학년 : <%= student.getStdYear() %> <br>
  </body>
</html>
