package com.example.servlet4.sec05;

import com.example.servlet4.sec04.MemberVO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class BookDAO {
    // DB 연결 담당 메소드
    public Connection connDB() {
        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/servletdb?serverTimezone=UTC";
            String user = "root";
            String pwd = "";

            con = DriverManager.getConnection(url, user, pwd);
            if(con != null) {
                System.out.println("연결 성공");
            }
        } catch(Exception e) {
            System.out.println("연결 오류 발생!");
            e.printStackTrace();
        }
        return con;
    }

    // 회원 정보 조회 메소드(전체 회원 정보 select : MemberVO 반환)
    // MemberVO를여러 행 반환 : ArrayList<MemberVO>
    public ArrayList<BookVO> bookSelect() {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<BookVO> bookList = new ArrayList<BookVO>();

        try {
            con = connDB();
            String query = "select * from book";
            preparedStatement = con.prepareStatement(query);
            resultSet = preparedStatement.executeQuery(query);

            while(resultSet.next()) { // 결과 세트에서 한 행씩 처리
                // 한 행(책 한 개당) 처리
                String bookNo = resultSet.getString("bookNo");
                String bookName = resultSet.getString("bookName");
                String bookAuthor = resultSet.getString("bookAuthor");
                int bookPrice = resultSet.getInt("bookPrice");
                Date bookDate = resultSet.getDate("bookDate");
                String pubNo = resultSet.getString("pubNo");
                // 한 행 정보 가져와 memberVO에 Setter 이용하여 저장
                BookVO vo = new BookVO();
                vo.setBookNo(bookNo);
                vo.setBookName(bookName);
                vo.setBookAuthor(bookAuthor);
                vo.setBookPrice(bookPrice);
                vo.setBookDate(bookDate);
                vo.setPubNo(pubNo);
                // 각 memberVO를 ArrayList에 저장
                bookList.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                preparedStatement.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return bookList;
    }
}