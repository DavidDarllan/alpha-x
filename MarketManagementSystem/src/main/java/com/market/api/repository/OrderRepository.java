package com.market.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.market.api.model.core.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
	@Query("select o from Order o")
	Page<Order> findAllOrders(Pageable pageable);
}
