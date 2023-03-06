package com.yancorrea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yancorrea.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
