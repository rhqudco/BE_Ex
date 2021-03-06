<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>상품 검색</title>
      <script src="<c:url value='/js/jquery-3.6.0.min.js/' />"></script>
      <script src="<c:url value='/js/productSearchForm.js/' />"></script>
    </head>
    <body>
      <h3>상품 검색</h3>
        <form id="prdSearchFrm">
            <select id="type" name="type">
                <option value="">검색 조건 선택</option>
                <option value="prdName">상품명</option>
                <option value="prdCompany">제조회사</option>
            </select>
            <input type="text" name="keyword">
            <input type="submit" value="검색">
        </form>
      <div id="searchResultBox"></div>
    </body>
</html>
