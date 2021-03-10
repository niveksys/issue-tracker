package com.niveksys.issuetracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "app_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String username;
    private String password;

    @OneToMany(mappedBy = "owner")
    private Set<Project> projects = new HashSet<>();

    @OneToMany(mappedBy = "reporter")
    private Set<Issue> issues = new HashSet<>();

    @ManyToMany(mappedBy = "assignees")
    private Set<Issue> assignedIssues = new HashSet<>();

}
