package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
	// home에서 studentForm 페이지 요청오면 처리
	@RequestMapping("/student/studentForm")
	public String studentFormView() {
		return "student/studentForm";
	}
	// (1) HttpServletRequest 클래스의 getParameter() 메소드 사용
	// 폼에서 전송된 데이터 받아서 변수에 저장하고
	// 다시 뷰 페이지로 전송 : Model 사용
	@RequestMapping("/student/newStudent")
	public String insertStudent(HttpServletRequest request, Model model) {
		// form의 <input> 태그의 name 속성의 값 받아서 변수에 저장
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String year = request.getParameter("year");
		
		// view 페이지로 출력 : Model 설정
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);
		
		return "student/studentResult";
	}
}