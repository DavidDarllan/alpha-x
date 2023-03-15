package com.market.api.model.stock;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.market.api.enums.PaymentType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product_receipt")
public class ProductReceiptOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private Supplier supplier;
	
	@Column(nullable = false)
	@CreationTimestamp
	private OffsetDateTime entryDate;
	
	@Enumerated
	private PaymentType Payment;
	
	
	
}
