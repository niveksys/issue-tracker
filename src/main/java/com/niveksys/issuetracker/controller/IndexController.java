package com.niveksys.issuetracker.controller;

import com.niveksys.issuetracker.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({ "", "/" })
    public String index(Model model) {
        log.debug("Redirect to LIST issues.");
        return "redirect:/issues";
    }

    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }
}
