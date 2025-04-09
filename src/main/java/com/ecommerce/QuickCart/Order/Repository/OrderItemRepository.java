package com.ecommerce.QuickCart.Order.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.QuickCart.Order.Entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
