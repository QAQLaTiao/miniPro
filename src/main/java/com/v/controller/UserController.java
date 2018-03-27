package com.v.controller;

import com.v.model.User;
import com.v.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author QAQ
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String toLogin() {
        System.out.println("============toLogin==========");
        return "login";
    }

    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request, String username, String password) {
        HttpSession session = request.getSession();
        System.out.println("============login==========");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user = userService.login(user);
        if (user != null) {
            session.setAttribute("userName", username);
            model.addAttribute("user", user);
            return "/index";
        }
        return "redirect:/";
    }

}
