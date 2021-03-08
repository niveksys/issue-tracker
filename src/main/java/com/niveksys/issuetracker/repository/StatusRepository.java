package com.niveksys.issuetracker.repository;

import java.util.Optional;

import com.niveksys.issuetracker.model.Status;

import org.springframework.data.repository.CrudRepository;

public interface StatusRepository extends CrudRepository<Status, Long> {

    Optional<Status> findByNameIgnoreCase(String name);

}
