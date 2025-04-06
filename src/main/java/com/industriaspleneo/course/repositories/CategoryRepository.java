package com.industriaspleneo.course.repositories;

import com.industriaspleneo.course.entities.Category;
import com.industriaspleneo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
