package com.ecommerce.QuickCart.Order.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ecommerce.QuickCarts.DTO.CartDto;


@FeignClient(name = "QuickCartCarts")
public interface CartClient {
	
	 @GetMapping("/cart/{userId}")
	    CartDto getCartByUserId(@PathVariable("userId") Long userId);

}
