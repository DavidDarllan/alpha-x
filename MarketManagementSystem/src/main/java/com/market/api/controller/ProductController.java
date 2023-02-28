package com.market.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.api.model.Product;
import com.market.api.service.ProductService;

@RestController
@RequestMapping("/api/products")

public class ProductController {

	@Autowired
	private ProductService productServ;
	
	@GetMapping()
	public ResponseEntity<List<Product>> findAll(){
		
		List<Product> products = productServ.findAllProduct();
		return ResponseEntity.ok().body(products);
	}

}
