package com.market.api.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.market.api.model.core.Product;


public interface ProductRepository extends JpaRepository<Product,Long>{

	@Query("select p from Product p order by p.price asc")
	public Page<Product> getAllProductsOrderedByPrice(Pageable pageable);
	
	@Query("select p from Product p order by p.name asc")
	public List<Product> getAllProductsOrderedByName();
	
	@Query("select p from Product p order by p.price desc")
	public Page<Product> getAllProductsOrderedByPriceDesc(Pageable pageable);
	
	Page<Product> findAll(Pageable pageable);
	
	public Page<Product>getAllActiveProducts(Pageable pageable);
}
