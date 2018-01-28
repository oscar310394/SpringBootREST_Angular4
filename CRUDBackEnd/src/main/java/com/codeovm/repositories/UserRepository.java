package com.codeovm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codeovm.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
