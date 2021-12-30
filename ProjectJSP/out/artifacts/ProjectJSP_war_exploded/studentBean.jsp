<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="student" class="main.StudentBean" scope="page"></jsp:useBean>
<html>
  <head>
      <title>자바 빈 액션 태그</title>
  </head>
  <body>
    <h3>빈 속성 값 설정(setProperty)</h3>
    <jsp:setProperty name="student" property="stdNo" value="2021001" />
    <jsp:setProperty name="student" property="stdName" value="홍길동" />
    <jsp:setProperty name="student" property="stdPhone" value="010-1111-1111" />
    <jsp:setProperty name="student" property="stdAddress" value="서울시 종로구" />
    <jsp:setProperty name="student" property="stdYear" value="4" />

    <h3>빈 속성 값 출력(getProperty)</h3>
    학번 : <jsp:getProperty name="student" property="stdNo"/> <br>
    이름 : <jsp:getProperty name="student" property="stdName"/> <br>
    연락처 : <jsp:getProperty name="student" property="stdPhone"/> <br>
    주소 : <jsp:getProperty name="student" property="stdAddress"/> <br>
    학년 : <jsp:getProperty name="student" property="stdYear"/>

    <h3>빈 속성 값 출력(Getter 사용)</h3>
    학번 : <%= student.getStdNo() %> <br>
    이름 : <%= student.getStdName() %> <br>
    연락처 : <%= student.getStdPhone() %> <br>
    주소 : <%= student.getStdAddress() %> <br>
    학년 : <%= student.getStdYear() %> <br>
  </body>
</html>
