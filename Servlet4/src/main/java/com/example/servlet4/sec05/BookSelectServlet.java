package com.example.servlet4.sec05;

import com.example.servlet4.sec04.MemberDAO;
import com.example.servlet4.sec04.MemberVO;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

@WebServlet("/sec05/BookSelectServlet")
public class BookSelectServlet extends HttpServlet {
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

        BookDAO dao = new BookDAO();
        ArrayList<BookVO> bookList = dao.bookSelect();
        out.print("<html><head></head><body>");
        out.print("<table border=1><tr align='center' bgcolor='gold'>");
        out.print("<td>도서번호</td><td>도서명</td><td>저자</td><td>가격</td>" +
                "<td>발행일</td><td>출판사번호</td></tr>");
        for(int i = 0; i < bookList.size(); i++) {
            // 오브젝트 반환 MemberVO 타입으로 형변환
            BookVO vo = (BookVO)bookList.get(i);
            String bookNo = vo.getBookNo();
            String bookName = vo.getBookName();
            String bookAuthor = vo.getBookAuthor();
            int bookPrice = vo.getBookPrice();
            Date bookDate = vo.getBookDate();
            String pubNo = vo.getPubNo();
            // 한 행씩 출력
            out.print("<tr><td>" + bookNo + "</td><td>" +
                    bookName + "</td><td>" +
                    bookAuthor + "</td><td>" +
                    bookPrice + "</td><td>" +
                    bookDate + "</td><td>" +
                    pubNo + "</td></tr>");
        }
        out.print("</table></body></head>");
    }
}
