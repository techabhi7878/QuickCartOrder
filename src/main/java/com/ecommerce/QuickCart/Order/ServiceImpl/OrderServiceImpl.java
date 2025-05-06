package com.ecommerce.QuickCart.Order.ServiceImpl;


import com.ecommerce.QuickCart.Order.DTO.OrderDto;
import com.ecommerce.QuickCart.Order.Entity.Order;
import com.ecommerce.QuickCart.Order.Entity.OrderStatus;
import com.ecommerce.QuickCart.Order.Repository.OrderRepository;
import com.ecommerce.QuickCart.Order.Service.CartClient;
import com.ecommerce.QuickCart.Order.Service.OrderService;
import com.ecommerce.QuickCart.Order.Service.PaymentClient;
import com.ecommerce.QuickCarts.DTO.CartDto;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class OrderServiceImpl implements OrderService {
	
	
	@Autowired
	private CartClient cartClient;
	
	
	@Autowired
	private PaymentClient paymentClient;
	
	@Autowired
	private  OrderRepository orderRepository;

    @Override
    public OrderDto placeOrder(Long userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setStatus(OrderStatus.PENDING);
        Order savedOrder = orderRepository.save(order);
        return new OrderDto(savedOrder.getUserId(), null, null, savedOrder.getStatus(), null);
    }

    @Override
    public OrderDto getOrderById(Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        return new OrderDto(order.getUserId(), null, null, order.getStatus(), null);
    }

    @Override
    public List<OrderDto> getOrdersByUserId(Long userId) {
        return orderRepository.findByUserId(userId)
                .stream()
                .map(order -> new OrderDto(order.getUserId(), null, null, order.getStatus(), null))
                .collect(Collectors.toList());
    }

    @Override
    public OrderDto updateOrderStatus(Long orderId, OrderStatus status) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setStatus(status);
        Order updatedOrder = orderRepository.save(order);
        return new OrderDto(updatedOrder.getUserId(), null, null, updatedOrder.getStatus(), null);
    }

    @Override
    public void cancelOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }

    public CartDto getCart(Long userId) {
        return cartClient.getCartByUserId(userId);
    }

}
