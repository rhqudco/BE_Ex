package com.example.servlet4.sec08;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

// sendRedirect() 사용해서 바인딩
@WebServlet("/sec08/first06")
public class FirstServlet06 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        request.setAttribute("address", "서울시 강남구");
        response.sendRedirect("second06");
    }
}