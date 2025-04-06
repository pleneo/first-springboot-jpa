package com.industriaspleneo.course.repositories;

import com.industriaspleneo.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
