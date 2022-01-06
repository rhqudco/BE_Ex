package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }
    @RequestMapping("/home")
    public String home(Model model) {
        return "home";
    }
}
