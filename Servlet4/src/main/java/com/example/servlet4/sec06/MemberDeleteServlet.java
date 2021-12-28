package com.example.servlet4.sec06;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

//@WebServlet("/MemberDeleteServlet")
@WebServlet(name = "MemberDeleteServlet", value = "/MemberDeleteServlet")
public class MemberDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String id = request.getParameter("id");

        MemberDAO dao = new MemberDAO();
        dao.memberDelete(id);
        // select 결과 페이지로 포워딩
        response.sendRedirect("sec06/MemberSelectServlet2");
    }
}
