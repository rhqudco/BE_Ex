package com.example.servlet4.sec06;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

public class MemberDAO {
    private Connection con = null;
    DataSource dataSource = null;
    // 생성자에서 DB연결 설정
    public MemberDAO() {
        try {
            Context init = new InitialContext();
            dataSource = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
            System.out.println("연결 성공");
        } catch (Exception e) {
            System.out.println("연결 실패");
            e.printStackTrace();
        }
    }

    // 회원 정보 조회 메소드(전체 회원 정보 select : MemberVO 반환)
    // MemberVO를여러 행 반환 : ArrayList<MemberVO>
    public ArrayList<MemberVO> memberSelect() {
        Connection con = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        ArrayList<MemberVO> memList = new ArrayList<MemberVO>();

        try {
            con = dataSource.getConnection();
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
            System.out.println("회원 조회 성공");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("회원 조회 실패");
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
    // 회원 정보 등록하는 메소드
    public void memberInsert(MemberVO memberVO) {
        try {
            con = dataSource.getConnection();

            String sql = "insert into member values(?, ?, ?, ?, default)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, memberVO.getId());
            preparedStatement.setString(2, memberVO.getPwd());
            preparedStatement.setString(3, memberVO.getName());
            preparedStatement.setString(4, memberVO.getEmail());
            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("회원 정보 입력 성공");
            }
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("insert 오류 발생!");
            e.printStackTrace();
        }
    }

    // 회원 정보 삭제 메소드
    public void memberDelete(String id ) {

        try {
            con = dataSource.getConnection();

            String sql = "delete from member where memId=?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, id);
            // 쿼리문 실행 : 영향을 받은 행의 수 반환
            //select : executeQuery - 결과 행 resultSet 반환.
            //insert / update / delete : executeUpdate() - 영향을 받은 행의 수 반환
            int result = preparedStatement.executeUpdate();

            if(result > 0) {
                System.out.println("회원 정보 삭제 성공!");
            }
            // 모든 객체 close() : 리소스 반납
            preparedStatement.close();
            con.close();
        } catch (Exception e) {
            System.out.println("delete 발생!");
            e.printStackTrace();
        }
    }
}
