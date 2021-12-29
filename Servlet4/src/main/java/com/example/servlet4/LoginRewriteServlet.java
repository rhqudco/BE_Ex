package com.example.servlet4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

@WebServlet("/loginrewrite")
public class LoginRewriteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        String user_id = request.getParameter("user_id");
        String user_pw = request.getParameter("user_pw");
        String user_address = request.getParameter("user_address");
        String user_email = request.getParameter("user_email");
        String user_hp = request.getParameter("user_hp");
        if (user_id != null && user_id.length() != 0) {
            String data = "<html><body>";
            data += "안녕하세요!<br> 로그인하셨습니다.<br><br>";
            data += "아이디 : " + user_id + "<br>";
            data += "비밀번호 : " + user_pw + "<br>";
            data += "주소 : " + user_address + "<br>";
            data += "이메일 : " + user_email + "<br>";
            data += "휴대전화 : " + user_hp;
            out.print(data);

            String grade = "A+";
            // URL Rewriting 방식 이용
            user_address = URLEncoder.encode(user_address, "utf-8");
           // 인코딩 하면 서울시+종로구 라고 나오고 하지 않으면 서울시%종로구 라고 나옴
            out.print("<br><br><a href='/second?user_id=" + user_id
                    + "&user_pw=" + user_pw
                    + "&user_address=" + user_address
                    + "'>두 번째 서블릿으로 보내기</a>");
            data = "</body></html>";
        }
        else {
            out.println("로그인 하지 않았습니다. <br><br>");
            out.println("다시 로그인 하세요. <br><br>");
            out.println("<a href='login-rewrite.html'>로그인 창으로 이동</a>");
        }
    }
}
