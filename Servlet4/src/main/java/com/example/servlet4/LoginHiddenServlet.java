package com.example.servlet4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/loginHidden")
public class LoginHiddenServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf8");
        PrintWriter out = response.getWriter();

        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        String user_address = request.getParameter("user_address");
        String user_email = request.getParameter("user_email");
        String user_hp = request.getParameter("user_hp");

        String data = "<html><body>";
        data += "안녕하세요<br> 로그인 하셨습니다.<br><br>";
        data += "아이디 : " + user_id + "<br>";
        data += "비밀번호 : " + user_pw + "<br>";
        data += "주소 : " + user_address + "<br>";
        data += "이메일 : " + user_email + "<br>";
        data += "휴대전화 : " + user_hp + "<br>";
        data += "</body></html>";
        out.print(data);
    }
}
