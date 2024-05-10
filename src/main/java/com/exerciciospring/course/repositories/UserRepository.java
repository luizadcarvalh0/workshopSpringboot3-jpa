package com.exerciciospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exerciciospring.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
