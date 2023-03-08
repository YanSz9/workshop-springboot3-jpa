package com.yancorrea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yancorrea.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
