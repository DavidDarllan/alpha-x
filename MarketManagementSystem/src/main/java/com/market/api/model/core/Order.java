package com.market.api.model.core;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;
import com.market.api.model.view.OrderView;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TB_ORDERS")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(OrderView.view.class)
	private Long id;
	
	@Column
	@JsonView(OrderView.view.class)
	private String code;	
	
	@Column
	@JsonView(OrderView.view.class)
	private Double total;
	
	@Column
	@JsonView(OrderView.view.class)
	private Double subTotal;
	
	

	
	
}
