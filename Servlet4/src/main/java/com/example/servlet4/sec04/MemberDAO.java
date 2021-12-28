package com.example.servlet4.sec04;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;

public class MemberDAO {
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
    public ArrayList<MemberVO> memberSelect() {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<MemberVO> memList = new ArrayList<MemberVO>();

        try {
            con = connDB();
            String query = "select * from member";
            preparedStatement = con.prepareStatement(query);
            resultSet = preparedStatement.executeQuery(query);

            while(resultSet.next()) { // 결과 세트에서 한 행씩 처리
                // 한 행(회원 1명당) 처리
                String id = resultSet.getString("memId");
                String pwd = resultSet.getString("memPwd");
                String name = resultSet.getString("memName");
                String email = resultSet.getString("memEmail");
                Date joinDate = resultSet.getDate("memJoinDate");
                // 한 행 정보 가져와 memberVO에 Setter 이용하여 저장
                MemberVO vo = new MemberVO();
                vo.setId(id);
                vo.setPwd(pwd);
                vo.setName(name);
                vo.setEmail(email);
                vo.setJoinDate(joinDate);
                // 각 memberVO를 ArrayList에 저장
                memList.add(vo);
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
        return  memList;
    }
}
