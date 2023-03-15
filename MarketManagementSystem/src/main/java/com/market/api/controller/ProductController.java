package com.market.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.market.api.model.core.Product;
import com.market.api.model.view.ProductView;
import com.market.api.service.ProductService;

@RestController
@RequestMapping("/api/products")

public class ProductController {

	@Autowired
	private ProductService productServ;

	@GetMapping()
	@JsonView(ProductView.view.class)
	public ResponseEntity<Page<Product>> findAll(
			Pageable pageable,
			@RequestParam(value = "page", defaultValue = "0") int page, 
			@RequestParam(defaultValue = "20") int size,
			@RequestParam(value = "priceSort", defaultValue = "asc") String sortDirection,
			@RequestParam(value = "status", defaultValue = "active")Boolean status) {

		Page<Product> prods = productServ.findAllProducts(pageable);
		if (sortDirection != null) {
			if (sortDirection.equalsIgnoreCase("desc")) {
				prods = productServ.orderByPriceDesc(pageable);
				return ResponseEntity.status(HttpStatus.OK).body(prods);
			} else {
				prods = productServ.orderByPrice(pageable);
				return ResponseEntity.status(HttpStatus.OK).body(prods);
			}
		}
		if(status = true) {
			
		}

		return ResponseEntity.ok().body(prods);
	}

	@GetMapping("/{id}")
	@JsonView(ProductView.view.class)
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product prod = productServ.findById(id);

		if (prod != null) {
			return ResponseEntity.status(HttpStatus.OK).body(prod);
		}
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

	}

	@PostMapping("/product")
	@JsonView(ProductView.view.class)
	public ResponseEntity<Product> insert(@RequestBody Product prod) {
		Product product = new Product(prod);
		productServ.insertProduct(product);
		return ResponseEntity.status(HttpStatus.OK).body(product);
	}

}