package com.yancorrea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yancorrea.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
