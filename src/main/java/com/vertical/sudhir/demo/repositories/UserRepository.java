package com.vertical.sudhir.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vertical.sudhir.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
