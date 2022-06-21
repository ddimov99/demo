package com.example.demo.controller;


import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AppController {
    @Autowired
    UserService userService;

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "main";
    }

    @RequestMapping("/new")
    public String newStudentPage(Model model) {
        User user = new User();
        Role role = new Role();
        model.addAttribute(user);
        model.addAttribute(role);
        return "new";
    }

    @RequestMapping("/403")
    public String error() {
        return "403";
    }


}
