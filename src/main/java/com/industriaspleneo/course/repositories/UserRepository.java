package com.industriaspleneo.course.repositories;

import com.industriaspleneo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
