<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Title</title>
  </head>
  <body>
    <c:set var="title1" value="hello world" />
    <c:set var="title2" value="쇼핑몰 중심 JSP 입니다" />
    <c:set var="str" value="중심" />
    title1 : ${title1} <br>
    title2 : ${title2} <br>
    str : ${str} <br>

  ${title1}의 문자열 길이 : ${fn:length(title1)} <br>
  title1 3 ~ 5 번째 문자열 추출 : ${fn:substring(title1, 2, 5)} <br>
  공백을 /로 변환 : ${fn:replace(title1, " ", "/")}<br>
  title1에 '중심' 단어 포함 여부 : ${fn:contains(title1, str)}<br>
  title2에 '중심' 단어 포함 여부 : ${fn:contains(title2, str)}<br>
  </body>
</html>