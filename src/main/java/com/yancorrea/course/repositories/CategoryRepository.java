package com.yancorrea.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yancorrea.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
