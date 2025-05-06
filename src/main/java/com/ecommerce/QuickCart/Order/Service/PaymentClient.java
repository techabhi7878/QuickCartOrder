package com.ecommerce.QuickCart.Order.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "QuickCartPayment")
public interface PaymentClient {
	
	 @PostMapping("/payment/pay")
	    String payForOrder(@RequestParam("orderId") Long orderId, @RequestParam("amount") Double amount);

}
