package com.niveksys.issuetracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "issue_type_id")
    private IssueType type;

    private String summary;
    private String description;

    @ManyToOne
    @JoinColumn(name = "reporter_user_id")
    private User reporter;

    @ManyToMany
    @JoinTable(name = "issue_assignee", joinColumns = @JoinColumn(name = "issue_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> assignees = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "issue_status_id")
    private IssueStatus status;

    public void addAssignee(User user) {
        this.assignees.add(user);
        user.getAssignedIssues().add(this);
    }

    public void removeAssignee(User user) {
        user.getAssignedIssues().remove(this);
        this.assignees.remove(user);
    }
}
