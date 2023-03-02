package com.market.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.market.api.model.Product;
import com.market.api.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class ProductService {
	
	private ProductRepository productRepo;
	
	public List<Product> findAllProduct(){
		List<Product> prods = productRepo.findAll();
		return prods;
	}
	
	@Transactional
	public Product insertProduct(Product prod) {
		return productRepo.save(prod);
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

}
