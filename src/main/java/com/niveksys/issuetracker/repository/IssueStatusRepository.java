package com.niveksys.issuetracker.repository;

import java.util.Optional;

import com.niveksys.issuetracker.model.IssueStatus;

import org.springframework.data.repository.CrudRepository;

public interface IssueStatusRepository extends CrudRepository<IssueStatus, Long> {

    Optional<IssueStatus> findByNameIgnoreCase(String name);

}
