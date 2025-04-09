package com.ecommerce.QuickCart.Order.DTO;



import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.ecommerce.QuickCart.Order.Entity.OrderStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDto {
	
	
	private Long userId;
    private List<OrderItemDto> orderItems;
    private BigDecimal totalPrice;
    private OrderStatus orderStatus;
    private LocalDateTime orderDate;

}
