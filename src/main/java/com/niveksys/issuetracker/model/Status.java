package com.niveksys.issuetracker.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "status")
public class Status extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private String name;

}
