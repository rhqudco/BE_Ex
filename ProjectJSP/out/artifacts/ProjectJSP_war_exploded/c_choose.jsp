<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<c:set var="id" value="hong" scope="page" />
<c:set var="pwd" value="1234" scope="page" />
<c:set var="name" value="${'홍길동'}" scope="page" />
<c:set var="age" value="${20}" scope="page" />
<c:set var="height" value="${170}" scope="page" />
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <table border="1" align="center">
      <tr align="center" bgcolor="#90ee90">
        <td width="7%">아이디</td>
        <td width="7%">비밀번호</td>
        <td width="7%">이름</td>
        <td width="7%">나이</td>
        <td width="7%">키</td>
        <c:choose>
          <c:when test="${empty name}">
            <tr align="center"><td colspan="5">이름이 없습니다.</td></tr>
          </c:when>
          <c:otherwise>
            <tr align="center">
              <td>${id}</td>
              <td>${pwd}</td>
              <td>${name}</td>
              <td>${age}</td>
              <td>${height}</td>
            </tr>
          </c:otherwise>
        </c:choose>
      </tr>
    </table>
  </body>
</html>