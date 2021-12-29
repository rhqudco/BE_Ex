package com.example.servlet4.sec09;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet("/sec09/memView")
public class MemberViewServlet extends HttpServlet {
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
        // 서버에서 클라이언트로 데이터 전송에 자바 IO스트림 이용
        PrintWriter out = response.getWriter();
//      비즈니스 로직 처리 : 바인딩 된 값 추출
        List memList = (List)request.getAttribute("memList");
//        ArrayList<MemberVO> memList = (ArrayList<MemberVO>)request.getAttribute("memList");
        out.print("<html><head></head><body>");
        out.print("<table border=1><tr align='center' bgcolor='gold'>");
        out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td>" +
                "<td>가입일</td><td>삭제</td></tr>");
        for(int i = 0; i < memList.size(); i++) {
            // 오브젝트 반환 MemberVO 타입으로 형변환
            MemberVO vo = (MemberVO)memList.get(i);
            String id = vo.getId();
            String pwd = vo.getPwd();
            String name = vo.getName();
            String email = vo.getEmail();
            Date joinDate = vo.getJoinDate();
            // 한 행씩 출력
            out.print("<tr><td>" + id + "</td><td>" +
                    pwd + "</td><td>" +
                    name + "</td><td>" +
                    email + "</td><td>" +
                    joinDate + "</td><td>" +
                    "<a href='/MemberDeleteServlet?id=" + id + "'>삭제</a></td></tr>");
        }
        out.print("</table></body></head>");
    }
}