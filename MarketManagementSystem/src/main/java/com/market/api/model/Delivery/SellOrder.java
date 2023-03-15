package com.market.api.model.Delivery;

import com.market.api.model.core.Order;

import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Table(name = "tb_sales")
@Data
@EqualsAndHashCode(callSuper = false)
public class SellOrder  extends Order{

	private static final long serialVersionUID = 1L;
	
	private Client client;

}
