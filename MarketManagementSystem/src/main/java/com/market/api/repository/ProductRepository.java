package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.api.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
