package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("user") User user, @ModelAttribute("role") Role role) {
        userService.addUser(user, role);
        return "redirect:/";
    }
}
