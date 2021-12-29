package com.example.servlet4.sec11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logInOut")
public class LoginLogout extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");

		// 처음 접속이면
		if(session.isNew()) {
			// user_id 입력 값이 있으면
			if(user_id != null) {
				// SID 이름, user_id 값으로 세션 변수 설정
				session.setAttribute("SID", user_id);
				// 다시 실행시켜서 SID 확인
				out.print("<a href='logInOut'>로그인 상태 확인</a>");
			}else { // user_id 입력 값이 없으면
				out.print("<a href='sessionLogin.html'>다시 로그인 하세요!</a>");
				session.invalidate();
			}

		} else {   //아니고 세션이 있으면
			user_id = (String) session.getAttribute("SID");
			if(user_id != null && user_id.length() != 0) {
				out.print("안녕하세요 " + user_id + "님!!");
				out.print("<br><a href='logout'>로그아웃</a>");
			} else {
				out.print("<a href='sessionLogin.html'>다시 로그인 하세요!</a>");
				session.invalidate();
			}
		}
	}
}