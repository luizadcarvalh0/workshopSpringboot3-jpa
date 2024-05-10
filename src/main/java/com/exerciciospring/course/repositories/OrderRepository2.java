package com.exerciciospring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exerciciospring.course.entities.Order;

@Repository
public interface OrderRepository2 extends JpaRepository<Order, Long> {

}
