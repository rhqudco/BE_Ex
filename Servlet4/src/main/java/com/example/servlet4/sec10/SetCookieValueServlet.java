package com.example.servlet4.sec10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.util.Date;

@WebServlet("/sec10/SetCookieValueServlet")
public class SetCookieValueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Date d = new Date();
        // Cookie 객체 생성한 후 cookieTest 이름으로 한글 정보를 인코딩해서 쿠키에 저장
        Cookie cookie = new Cookie("cookieTest", URLEncoder.encode("Cookie 테스트입니다.","utf-8"));
//        Cookie cookie2 = new Cookie("cookieTest", "Cookie 테스트입니다."); 인코딩하지 않으면 아예 500번 오류 발생
//        cookie.setMaxAge(24 * 60 * 60); // 유효기간 설정 Persistence 쿠키 : 정해진 시간 지나면 쿠키 만료
        cookie.setMaxAge(-1); // Session 쿠키로 설정 : 브라우저 종료되면 쿠키 만료
        response.addCookie(cookie); // 생성한 쿠키를 브라우저로 전송해서 저장
        out.println("현재 시간 : " + d);
        out.println("<br> Cookie에 저장");
    }
}
