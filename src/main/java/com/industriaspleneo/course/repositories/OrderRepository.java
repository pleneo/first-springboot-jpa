package com.industriaspleneo.course.repositories;

import com.industriaspleneo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
