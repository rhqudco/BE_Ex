package com.example.servlet4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        String user_address = request.getParameter("user_address");

        out.print("<html><body>");
        if(user_id != null && user_id.length() != 0) {
            out.println("이미 로그인 상태입니다. <br><br>");
            out.println("첫 번째 서블릿에서 넘겨준 아이디 : " + user_id + "<br>");
            out.println("첫 번째 서블릿에서 넘겨준 비밀번호 : " + user_pw + "<br>");
            out.println("첫 번째 서블릿에서 넘겨준 주소 : " + user_address + "<br>");
            out.print("</body></html>");
        }
        else {
            out.println("로그인 하지 않았습니다. <br><br>");
            out.println("다시 로그인 하세요. <br><br>");
            out.println("<a href='login-rewrite.html'>로그인 창으로 이동</a>");
        }
    }
}
