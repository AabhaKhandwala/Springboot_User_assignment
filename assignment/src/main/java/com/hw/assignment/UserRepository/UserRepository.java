package com.hw.assignment.UserRepository;

import com.hw.assignment.UserDomain.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
