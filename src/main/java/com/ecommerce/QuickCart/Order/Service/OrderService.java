package com.ecommerce.QuickCart.Order.Service;



import java.util.List;

import com.ecommerce.QuickCart.Order.DTO.OrderDto;
import com.ecommerce.QuickCart.Order.Entity.OrderStatus;
public interface OrderService {
	
	OrderDto placeOrder(Long userId);
    OrderDto getOrderById(Long orderId);
    List<OrderDto> getOrdersByUserId(Long userId);
    OrderDto updateOrderStatus(Long orderId, OrderStatus status);
    void cancelOrder(Long orderId);

}
