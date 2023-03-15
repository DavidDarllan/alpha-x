package com.market.api.model.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
import com.market.api.model.view.ProductView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Table(name = "tb_products")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(ProductView.view.class)
	private Long id;
	
	@Column(nullable = false)
	@JsonView(ProductView.view.class)
	private String name;
	
	@Column(nullable = false)
	@JsonView(ProductView.view.class)
	private String description;
	
	@Column(nullable = false)
	@JsonView(ProductView.view.class)
	private Double quantity;
	
	@Column(nullable = false)
	@JsonView(ProductView.view.class)
	private Double price;
	
	@Column
	@Builder.Default
	private Boolean active = true;

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
