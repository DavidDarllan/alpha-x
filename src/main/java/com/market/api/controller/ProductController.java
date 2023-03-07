package com.market.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.api.model.Product;
import com.market.api.service.ProductService;

@RestController
@RequestMapping("/api/products")

public class ProductController {

	@Autowired
	private ProductService productServ;
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> products = productServ.findAllProduct();
		return ResponseEntity.ok().body(products);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product prod = productServ.findById(id);
		
		if(prod != null) {
			return ResponseEntity.status(HttpStatus.OK).body(prod);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> insert(@RequestBody Product prod){
		Product product = new Product(prod);
		productServ.insertProduct(product);
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}
	
	
}	