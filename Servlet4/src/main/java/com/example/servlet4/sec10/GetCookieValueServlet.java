package com.example.servlet4.sec10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Date;

@WebServlet("/sec10/GetCookieValueServlet")
public class GetCookieValueServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        Cookie[] allValues = request.getCookies();
        for(int i = 0; i < allValues.length; i++) {
            if(allValues[i].getName().equals("cookieTest")) {
                out.println("<h3> Cookie 값 가져오기 : " + URLDecoder.decode(allValues[i].getValue(), "utf-8"));
                out.println("<h3> Cookie 값 가져오기 : " + allValues[i].getValue());
            }
        }
    }
}