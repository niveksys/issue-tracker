package com.niveksys.issuetracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class IndexController {

    @RequestMapping({ "", "/" })
    public String getIndexPage(Model model) {
        log.debug("Redirect to LIST issues.");
        return "redirect:/issues";
    }

}
