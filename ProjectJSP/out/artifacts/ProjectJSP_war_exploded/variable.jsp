<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <%!
      // 선언문
      // 변수 선언 및 초기화만 가능
      int x = 10;
      long y;
      // y = 100; 이 경우 오류(서넌부에서는 값을 지정할 수 없음. 선언과 동시에 초기화만 가능)
      float floatValue = 3.14f;
      double doubleValue = 3.14;

      char ch = 'a';
      String myJob = "프로그래머";

      boolean b = true;
    %>
    <%
      y = 100; // 스크립트릿 영역에서 값 지정
      String name = "홍길동";
    %>
    <h3>변수 값 출력</h3>
      x : <%= x %><br>
      y : <%= y %><br>
      floatValue : <%= floatValue %><br>
      doubleValue : <%= doubleValue %><br>
      ch : <%= ch %><br>
      myJob : <%= myJob %><br>
      b : <%= b %><br>
      name : <%= name %><br>
  </body>
</html>
