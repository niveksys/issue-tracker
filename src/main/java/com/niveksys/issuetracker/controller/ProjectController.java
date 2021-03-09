package com.niveksys.issuetracker.controller;

import com.niveksys.issuetracker.repository.ProjectRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @GetMapping({ "", "/" })
    public String listProjects(Model model) {
        log.debug("LIST all Projects.");
        model.addAttribute("projects", this.projectRepository.findAll());
        return "projects/list";
    }

}
