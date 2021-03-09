package com.niveksys.issuetracker.controller;

import com.niveksys.issuetracker.repository.IssueRepository;
import com.niveksys.issuetracker.repository.IssueTypeRepository;
import com.niveksys.issuetracker.repository.ProjectRepository;
import com.niveksys.issuetracker.repository.IssueStatusRepository;
import com.niveksys.issuetracker.repository.UserRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/issues")
public class IssueController {

    private final IssueRepository issueRepository;
    private final IssueTypeRepository issueTypeRepository;
    private final IssueStatusRepository issueStatusRepository;
    private final ProjectRepository projectRepository;
    private final UserRepository userRepository;

    public IssueController(IssueRepository issueRepository, IssueTypeRepository issueTypeRepository,
            IssueStatusRepository issueStatusRepository, ProjectRepository projectRepository,
            UserRepository userRepository) {
        this.issueRepository = issueRepository;
        this.issueTypeRepository = issueTypeRepository;
        this.issueStatusRepository = issueStatusRepository;
        this.projectRepository = projectRepository;
        this.userRepository = userRepository;
    }

    @GetMapping({ "", "/" })
    public String listIssues(Model model) {
        log.debug("LIST all Issues.");
        model.addAttribute("issues", this.issueRepository.findAll());
        return "issues/list";
    }

}
