package com.niveksys.issuetracker.repository;

import java.util.Optional;

import com.niveksys.issuetracker.model.IssueType;

import org.springframework.data.repository.CrudRepository;

public interface IssueTypeRepository extends CrudRepository<IssueType, Long> {

    Optional<IssueType> findByNameIgnoreCase(String name);

}
