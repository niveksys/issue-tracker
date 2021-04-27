package com.niveksys.issuetracker.bootstrap;

import javax.transaction.Transactional;

import com.niveksys.issuetracker.model.Issue;
import com.niveksys.issuetracker.model.IssueType;
import com.niveksys.issuetracker.model.Project;
import com.niveksys.issuetracker.model.IssueStatus;
import com.niveksys.issuetracker.model.User;
import com.niveksys.issuetracker.repository.IssueRepository;
import com.niveksys.issuetracker.repository.IssueTypeRepository;
import com.niveksys.issuetracker.repository.ProjectRepository;
import com.niveksys.issuetracker.repository.IssueStatusRepository;
import com.niveksys.issuetracker.repository.UserRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Profile("default")
public class BootstrapData implements CommandLineRunner {

    private final UserRepository userRepository;
    private final ProjectRepository projectRepository;
    private final IssueRepository issueRepository;
    private final IssueTypeRepository issueTypeRepository;
    private final IssueStatusRepository issueStatusRepository;

    public BootstrapData(UserRepository userRepository, ProjectRepository projectRepository,
            IssueRepository issueRepository, IssueTypeRepository issueTypeRepository,
            IssueStatusRepository issueStatusRepository) {
        this.userRepository = userRepository;
        this.projectRepository = projectRepository;
        this.issueRepository = issueRepository;
        this.issueTypeRepository = issueTypeRepository;
        this.issueStatusRepository = issueStatusRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        log.debug("Bootstrapping data...");
        this.validateData();
        this.loadIssues();
        log.debug("Bootstrapping complated.");
    }

    private void validateData() {
        if (this.userRepository.count() == 0) {
            throw new RuntimeException("User didn't load from data.sql");
        }
        if (this.issueTypeRepository.count() == 0) {
            throw new RuntimeException("Issue Type didn't load from data.sql");
        }
        if (this.issueStatusRepository.count() == 0) {
            throw new RuntimeException("Status didn't load from data.sql");
        }
    }

    private void loadIssues() {

        User peter = this.userRepository.findByUsernameIgnoreCase("Peter").get();
        User paul = this.userRepository.findByUsernameIgnoreCase("Paul").get();
        User mary = this.userRepository.findByUsernameIgnoreCase("Mary").get();

        IssueType feature = this.issueTypeRepository.findByNameIgnoreCase("new feature").get();
        IssueType enhancement = this.issueTypeRepository.findByNameIgnoreCase("enhancement").get();
        IssueType task = this.issueTypeRepository.findByNameIgnoreCase("task").get();
        IssueType bug = this.issueTypeRepository.findByNameIgnoreCase("bug").get();
        IssueType incident = this.issueTypeRepository.findByNameIgnoreCase("incident").get();

        IssueStatus backlog = this.issueStatusRepository.findByNameIgnoreCase("backlog").get();
        IssueStatus todo = this.issueStatusRepository.findByNameIgnoreCase("todo").get();
        IssueStatus progress = this.issueStatusRepository.findByNameIgnoreCase("in progress").get();
        IssueStatus done = this.issueStatusRepository.findByNameIgnoreCase("done").get();

        Project springBootPOC = new Project();
        springBootPOC.setCodename("SPRING-POC");
        springBootPOC.setDescription("Spring Boot POC");
        springBootPOC.setOwner(peter);
        this.projectRepository.save(springBootPOC);

        Project dockerPOC = new Project();
        dockerPOC.setCodename("DOCKER-POC");
        dockerPOC.setDescription("Docker POC");
        dockerPOC.setOwner(peter);
        this.projectRepository.save(dockerPOC);

        Issue issue1 = new Issue();
        issue1.setProject(springBootPOC);
        issue1.setType(task);
        issue1.setSummary("Setup Java Development Environment");
        issue1.setDescription(
                "1. Install Java Development Kit (JDK) - Adopt Open JDK.\n2. Install Apache Maven.\n3. Install Visual Studio Code.");
        issue1.setReporter(peter);
        issue1.addAssignee(paul);
        issue1.setStatus(done);
        this.issueRepository.save(issue1);

        Issue issue2 = new Issue();
        issue2.setProject(springBootPOC);
        issue2.setType(task);
        issue2.setSummary("Implement Spring Boot Sample Web App");
        issue2.setDescription(
                "1. Create Model Entity.\n2. Create Data Repository.\n3. Bootstrapping Data.\n4. Create Controller.\n5. Create View with Thymeleaf and Bootstrap.");
        issue2.setReporter(peter);
        issue2.addAssignee(paul);
        issue2.addAssignee(mary);
        issue2.setStatus(done);
        this.issueRepository.save(issue2);

        Issue issue3 = new Issue();
        issue3.setProject(springBootPOC);
        issue3.setType(feature);
        issue3.setSummary("Implement CRUD operations on Issues");
        issue3.setDescription("1. Upadte Controller for CRUD.\n2. Add view templates for CRUD operations.");
        issue3.setReporter(peter);
        issue3.addAssignee(peter);
        issue3.setStatus(todo);
        this.issueRepository.save(issue3);

        Issue issue4 = new Issue();
        issue4.setProject(springBootPOC);
        issue4.setType(enhancement);
        issue4.setSummary("Implement RESTful API on Issues");
        issue4.setDescription("- Add Controller for RESTful API.");
        issue4.setReporter(peter);
        issue4.addAssignee(paul);
        issue4.setStatus(backlog);
        this.issueRepository.save(issue4);

        Issue issue5 = new Issue();
        issue5.setProject(dockerPOC);
        issue5.setType(task);
        issue5.setSummary("Setup Docker Environment");
        issue5.setDescription(
                "1. Install Docker Desktop.\n2. Install WSL 2 (Windows Subsystem for Linux).\n3. Run Docker Getting Started Image.");
        issue5.setReporter(peter);
        issue5.addAssignee(peter);
        issue5.addAssignee(paul);
        issue5.addAssignee(mary);
        issue5.setStatus(todo);
        this.issueRepository.save(issue5);

        Issue issue6 = new Issue();
        issue6.setProject(dockerPOC);
        issue6.setType(task);
        issue6.setSummary("Setup MySQL database with Docker Image");
        issue6.setDescription(
                "1. Run MySQL Docker image.\n2. Test on mysql console.\n3. Install MySQL Workbench to test connectivity.");
        issue6.setReporter(peter);
        issue6.addAssignee(mary);
        issue6.setStatus(progress);
        this.issueRepository.save(issue6);

        Issue issue7 = new Issue();
        issue7.setProject(dockerPOC);
        issue7.setType(task);
        issue7.setSummary("Setup Git for Windows");
        issue7.setDescription("1. Install Git for Windows.\n2. Setup Identity.\n3. Commit initial sources.");
        issue7.setReporter(peter);
        issue7.addAssignee(paul);
        issue7.setStatus(todo);
        this.issueRepository.save(issue7);
    }

}
