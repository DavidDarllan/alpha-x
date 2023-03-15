package com.market.api.model.stock;

import java.util.List;

import com.market.api.model.core.Order;
import com.market.api.model.core.Product;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Table(name = "damaged_products_orders")
public class DamagedProductsOrder extends Order{

	private static final long serialVersionUID = 1L;
	
	@ManyToMany
	private List<Product> damagedProducts;

}
