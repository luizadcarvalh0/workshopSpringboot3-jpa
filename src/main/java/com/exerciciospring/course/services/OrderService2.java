package com.exerciciospring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exerciciospring.course.entities.Order;
import com.exerciciospring.course.repositories.OrderRepository2;

@Service
public class OrderService2 {

	@Autowired
	private OrderRepository2 repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
