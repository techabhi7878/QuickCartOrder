package com.ecommerce.QuickCart.Order.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.QuickCart.Order.DTO.OrderDto;
import com.ecommerce.QuickCart.Order.Service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
	
	 private final OrderService orderService;

	    @PostMapping("/place/{userId}")
	    public ResponseEntity<OrderDto> placeOrder(@PathVariable Long userId) {
	        return ResponseEntity.ok(orderService.placeOrder(userId));
	    }

}
