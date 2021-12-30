<%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <font color='red' size="3pt">
            bottom2.jsp 입니다.<p>
            작성자 <b> <%= name %> <b> 입니다.
            <%-- name :  선언되지 않은 변수이기 때문에 오류 발생 --%>
            <%-- 다른 페이지에 포함되어서 선언되어 있는 name 변수 사용 시 오류 없음 --%>
