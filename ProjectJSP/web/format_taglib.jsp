<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>formatNumber</h3>
    <c:set var="price" value="100000000"/>
    <fmt:formatNumber type="number" value="${price}" var="priceNumber"/>
    일반 숫자로 표현 : ${priceNumber}<br>
    통화로 표현 : <fmt:formatNumber type="currency" value="${price}" currencySymbol="$" /><br>
<!--천 단위 구분 표시 : groupingUsed="ture" or "false" (default : true)-->
    퍼센트로 포현 : <fmt:formatNumber type="percent" value="${price}" groupingUsed="true" /><br>
    <h3>formatDate</h3>
    <c:set var="now" value="<%= new Date()%>" />
    일반 날짜로 표현 : ${now} <br>
    포매팅 스타일없이 : <fmt:formatDate value="${now}" type="date" /> <br>
    포매팅 full : <fmt:formatDate value="${now}" type="date" dateStyle="full" /> <br>
    포매팅 short : <fmt:formatDate value="${now}" type="date" dateStyle="short" /> <br>
    포매팅 type:time : <fmt:formatDate value="${now}" type="time" /> <br>
    포매팅 type:both : <fmt:formatDate value="${now}" type="both" /> <br>
    포매팅 type:both dateStyle:full timeStyle:full : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" /> <br>
    패턴 yyyy-MM-dd hh:mm:ss <fmt:formatDate value="${now}" pattern="yyyy-MM-dd hh:mm:ss" /> <br>

    한국 현재 시간 : <fmt:formatDate value="${now}" type="both" dateStyle="full" timeStyle="full" /> <br>
    뉴욕 현재 시간 : <fmt:formatDate value="${now}" timeZone="GMT-5" type="both" dateStyle="full" timeStyle="full" />
</body>
</html>