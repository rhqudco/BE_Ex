package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 30);
        return "showInfo";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }

    @RequestMapping("/showInfo")
    public String showInfo(Model model) {
        model.addAttribute("name", "홍길동");
        model.addAttribute("age", 30);
        return "showInfo";
    }
    @RequestMapping("showInfo2")
    public ModelAndView showInfo2(ModelAndView mv) {
        mv.addObject("name", "이몽룡");
        mv.addObject("address", "서울");

        mv.setViewName("showInfo2");
        return mv;
    }
}