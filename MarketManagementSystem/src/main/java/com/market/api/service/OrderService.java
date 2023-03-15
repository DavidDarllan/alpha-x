package com.market.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.market.api.model.core.Order;
import com.market.api.repository.OrderRepository;

@Service
public class OrderService{

	@Autowired
	private OrderRepository orderRepo;
	
	public Page<Order> findAllOrders(Pageable pageable){
		Page<Order> orders= orderRepo.findAll(pageable);
		return orders;
	}
	
	
}
