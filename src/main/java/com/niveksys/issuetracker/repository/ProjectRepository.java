package com.niveksys.issuetracker.repository;

import com.niveksys.issuetracker.model.Project;

import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
