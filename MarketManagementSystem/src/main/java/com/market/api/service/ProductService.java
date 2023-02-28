package com.market.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.market.api.model.Product;
import com.market.api.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepo;
	
	public List<Product> findAllProduct(){
		List<Product> prods = productRepo.findAll();
		return prods;
	}

}
