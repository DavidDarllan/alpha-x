package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.market.api.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
