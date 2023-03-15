package com.market.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.api.model.core.Order;
import com.market.api.service.OrderService;

@RestController
@RequestMapping("api/productOrders")
public class OrderController {

	@Autowired
	private OrderService orderServ;
	
	@GetMapping()
	public ResponseEntity<Page<Order>> findAll(Pageable pageable){
		Page<Order> orders = orderServ.findAllOrders(pageable);
		
		return ResponseEntity.status(HttpStatus.OK).body(orders);
		
	}
}
