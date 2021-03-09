package com.niveksys.issuetracker.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "project")
public class Project extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String codename;
    private String description;

    @ManyToOne
    @JoinColumn(name = "owner_user_id")
    private User owner;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project")
    private Set<Issue> issues = new HashSet<>();

}
