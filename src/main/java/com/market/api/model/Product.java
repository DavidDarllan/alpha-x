package com.market.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "tb_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String description;
	
	@Column(nullable = false)
	private Double quantity;
	
	@Column(nullable = false)
	private Double price;
	
	@Column
	private Boolean active;

	public Product(Product prod) {
		this.name = prod.getName();
		this.description = prod.getDescription();
		this.price = prod.getPrice();
		this.quantity = prod.getQuantity();
	}
	public Product(String name, String description, Double price, Double quantity) {
		super();
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	
	
	
	
	
	
}
