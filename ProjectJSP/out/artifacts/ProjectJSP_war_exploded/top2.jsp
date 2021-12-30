<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Date date = new Date();
%>
        <font color='blue' size="3pt">
            top2.jsp 입니다.<p>
            <%= date.toLocaleString() %>
