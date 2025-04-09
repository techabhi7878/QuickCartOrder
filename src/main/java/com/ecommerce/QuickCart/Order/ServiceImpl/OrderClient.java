package com.ecommerce.QuickCart.Order.ServiceImpl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.QuickCart.Order.DTO.OrderDto;

@FeignClient(name = "Order-Service" , path = "/Order")
public interface OrderClient {

	@GetMapping("/{id}")
	ResponseEntity<OrderDto>getOrderById(@PathVariable("id") Long id);
}
