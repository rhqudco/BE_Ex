<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>c:forEach</title>
	</head>
	<body>
		<c:forEach var="i" begin="1" end="10" step="1" varStatus="loop">
			i = ${i } &nbsp;&nbsp; 반복회수 : ${loop.count } 
			 &nbsp;&nbsp; 인덱스 :  ${loop.index }
			 &nbsp;&nbsp; 첫 번째 : ${loop.first } 
			 &nbsp;&nbsp; 마지막 : ${loop.last }<br>		
		</c:forEach>
	</body>
</html>