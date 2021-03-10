package com.niveksys.issuetracker.repository;

import java.util.Optional;

import com.niveksys.issuetracker.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsernameIgnoreCase(String name);

}
