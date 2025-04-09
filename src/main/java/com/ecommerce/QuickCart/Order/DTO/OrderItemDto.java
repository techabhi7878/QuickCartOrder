package com.ecommerce.QuickCart.Order.DTO;


import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItemDto {
	
	  private Long productId;
	    private int quantity;
	    private BigDecimal price;

}
