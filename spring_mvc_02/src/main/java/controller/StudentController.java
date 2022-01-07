package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	@RequestMapping("/student/newStudent2")
	public String insertStrudent2(@RequestParam("no") String no,
								  @RequestParam("name") String name,
								  @RequestParam("year") String year,
								  Model model) {

		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);

		return "student/studentResult";
	}
	@RequestMapping("/student/newStudent3")
	public String insertStudent3(Student student) {
		// command 객체는 자동으로 View Model에 등록됨 : Model 등록 필요 없음.
		return "student/studentCmdResult";
	}
	// Command 객체 이름 변경 : @ModelAttribute 어노테이션 사용
	@RequestMapping("/student/newStudent4")
	public String insertStudent4(@ModelAttribute("stdInfo") Student student) {
		// command 객체는 자동으로 View Model에 등록됨 : Model 등록 필요 없음.
		return "student/studentCmdRenameResult";
	}

	// 4. url을 통한 데이터 전송 @PathVariable 사용
	@RequestMapping("/student/studentModify/{stdNo}")
	public String studentModify(@PathVariable String stdNo) {
		// 수정 처리헸다 가정하고 home 페이지로 이동
		System.out.println(stdNo);
//		return "jsp/home"; // URL에 입력 값이 뜨는 이슈 발생.
		return "redirect:/";
//		"redirect:다시 이동할 URL"
//		다시 이동할 URL로 가서 Controller가 작동하는 알고리즘 수행 후 return에 있는 페이지로 이동함.
	}
}