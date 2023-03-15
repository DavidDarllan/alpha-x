package com.market.api.model.Delivery;

import java.util.Set;

import com.market.api.enums.OrderStatus;
import com.market.api.model.core.Order;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_delivery")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DeliveryOrder {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Set<Order> orders;
	
	private Double deliveryCust;
	
	@ManyToOne
	private Deliveryman deliveryman;
	
	private OrderStatus status;
	
	
	
	

}
