package com.example.servlet4.sec06;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

@WebServlet("/sec06/MemberInsertServlet")
public class MemberInsertServlet extends HttpServlet {
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
        response.setContentType("text/html;charset=utf-8");

        String id = request.getParameter("user_id");
        String pwd = request.getParameter("user_pw");
        String name = request.getParameter("user_name");
        String email = request.getParameter("user_email1");

        MemberVO memberVO = new MemberVO();
        memberVO.setId(id);
        memberVO.setPwd(pwd);
        memberVO.setName(name);
        memberVO.setEmail(email);
        // or
        // MemberVO memberVO = new MemberVO(id, pwd, name,email);
        MemberDAO memberDAO = new MemberDAO();
        memberDAO.memberInsert(memberVO);
    }
}
