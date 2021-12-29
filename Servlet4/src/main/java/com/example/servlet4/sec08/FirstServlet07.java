package com.example.servlet4.sec08;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/sec08/first07")
public class FirstServlet07 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        request.setAttribute("address", "서울시 강남구");
        request.setAttribute("name", "홍길동");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("second07");
        requestDispatcher.forward(request, response);
    }
}