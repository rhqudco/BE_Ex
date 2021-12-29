package com.example.servlet4.sec09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/sec09/memBinding")
public class MemberBindingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MemberDAO dao = new MemberDAO();
        ArrayList<MemberVO> memList = dao.memberSelect();

        request.setAttribute("memList", memList); // name, data
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("memView");
        requestDispatcher.forward(request, response);
    }
}
