package com.market.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.market.api.model.core.Product;
import com.market.api.repository.ProductRepository;

import jakarta.transaction.Transactional;
	
@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepo;
	
	public List<Product> findAllProduct(){
		List<Product> prods = new ArrayList<>();
		prods = productRepo.findAll();
		return prods;
	}
	public Page<Product> findAllProducts(Pageable pageable){
		Page<Product> prods = productRepo.findAll(pageable);
		return prods;
	}
	
	
	@Transactional
	public Product insertProduct(Product prod) {
		return productRepo.save(prod);
	}
	
	public Page<Product> orderByPrice(Pageable pageable){
		Page<Product> prods = productRepo.getAllProductsOrderedByPrice(pageable);
		return prods;
		
	}
	
	public Product findById(Long id) {
		Optional<Product> prod = productRepo.findById(id);
		if(prod.isPresent()) {
			return prod.get();
		}
		return null;
		

}
	public Page<Product> orderByPriceDesc(Pageable pageable){
		Page<Product> prods = productRepo.getAllProductsOrderedByPriceDesc(pageable);
		return prods;
		
	}
	}
