package com.example.servlet4.sec08;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sec08/second06")
public class SecondServlet06 extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        // url 뒤에 붙어서 전송된 데이터 받기
        String address = (String)request.getAttribute("address");
        out.print("<html><body>");
        out.print("redirect 이용한 바인딩<br>");
        out.print("주소 : " + address);
        out.println("</body></html>");
//        redirect 이용한 바인딩
//        주소 : null
    }
}