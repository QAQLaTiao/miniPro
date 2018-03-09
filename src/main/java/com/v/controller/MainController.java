package com.v.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author QAQ
 */
@Controller
@RequestMapping("/")
public class MainController {


    @RequestMapping("/main")
    public String main() {
        System.out.println("============main==========");
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, String username, String password) {
        HttpSession session = request.getSession();
        System.out.println("============login==========");
        if ("admin123".equals(username)) {
            if ("123".equals(password)) {
                return "/index";
            }
        }
        return "redirect:/main";
    }


}
