package com.ApnaKart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApnaKart.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
