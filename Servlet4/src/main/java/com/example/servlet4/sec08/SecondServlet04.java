package com.example.servlet4.sec08;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sec08/second04")
public class SecondServlet04 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        // url 뒤에 붙어서 전송된 데이터 받기
        String name = request.getParameter("name");
        out.print("<html><body>");
        out.print("redirect 이용한 포워딩으로 데이터 전달 받기<br>");
        out.print("이름 : " + name);
        out.println("</body></html>");
    }
}