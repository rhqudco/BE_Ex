<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>폼에 입력한 값으로 빈 속성값 한번에 설정</title>
  </head>
  <body>
      <%
          request.setCharacterEncoding("utf-8");
      %>

      <h3>학생 정보 출력 (EL param 객체 사용)</h3>
      학번 : ${param.stdNo } <br>
      성명 : ${param.stdName } <br>
      전화번호 : ${param.stdPhone} <br>
      주소 : ${param.stdAddress } <br>
      학년 : ${param.stdYear } <br>

      <h3>로그인 페이지로 이동하는 여러 가지 방법</h3>
      url 사용 : <a href="http://localhost:8080/login.jsp"> 로그인</a><br>
      URI 사용 : <a href="/login.jsp">로그인</a><br>
      getContextPath() 메소드 사용 : <a href="<%=request.getContextPath()%>/login.jsp">로그인</a><br>
      pageContext 내장 객체 사용  : <a href="${pageContext.request.contextPath }/login.jsp">로그인</a><br>
  </body>
</html>