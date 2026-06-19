package com.tatianapacheco.workshop_springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tatianapacheco.workshop_springboot.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
