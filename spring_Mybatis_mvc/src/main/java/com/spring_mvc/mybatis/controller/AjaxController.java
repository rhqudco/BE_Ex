package com.spring_mvc.mybatis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
    // 로그인 폼으로 이동
    @RequestMapping("/logForm")
    public String loginForm() {
        return "ajax/loginForm";
    }

    // 로그인 폼2로 이동
    @RequestMapping("/logForm2")
    public String loginForm2() {
        return "ajax/loginForm2";
    }

    //로그인 처리
    @ResponseBody
    @RequestMapping("/login")
//	public String loginCheck(@RequestParam("user_id") String id,
//							 @RequestParam("user_pw") String pw) {
    public String loginCheck(@RequestParam("id") String id,
                             @RequestParam("pw") String pw) { // Ajax 사용하는 경우 id, pw로 보냈으므로, id, pw로 받음
        // 로그인 체크 (가정)
        String result = "";
        if(id.equals("abcd") && pw.equals("1234"))
            result ="success";
        else
            result = "fail";
        return result;
    }
    // @ResponseBody가 없는 경우 : success.jsp 또는 fail.jsp 반환
    // @ResponseBody가 있는 경우 : 본문에 result 포함해서 반환(새 페이지에서 success 또는 fail 출력)
}
