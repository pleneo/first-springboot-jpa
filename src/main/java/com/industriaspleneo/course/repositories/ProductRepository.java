package com.industriaspleneo.course.repositories;

import com.industriaspleneo.course.entities.Category;
import com.industriaspleneo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
