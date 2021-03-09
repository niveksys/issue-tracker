package com.niveksys.issuetracker.repository;

import com.niveksys.issuetracker.model.Issue;

import org.springframework.data.repository.CrudRepository;

public interface IssueRepository extends CrudRepository<Issue, Long> {

    Iterable<Issue> findBySummaryContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String summary,
            String description);

}
