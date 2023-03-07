package com.market.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.api.model.Product;
import com.market.api.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
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
	
	public Product findById(Long id) {
		Optional<Product> prod = productRepo.findById(id);
		if(prod.isPresent()) {
			return prod.get();
		}
		else {
			throw new EntityNotFoundException();
		}
	}
	
	@Transactional
	public Product insertProduct(Product prod) {
		return productRepo.save(prod);
	}

}
