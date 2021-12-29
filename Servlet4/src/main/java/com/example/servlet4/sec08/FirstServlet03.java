package com.example.servlet4.sec08;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sec08/first03")
public class FirstServlet03 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    // location을 이용한 포워딩
    // 자바스크립트의 location 객체 사용
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<script type='text/javascript'>");
        out.print("location.href='second03';");
        out.println("</script>");
    }
}