package com.market.api.model.Delivery;

import java.util.Map;

import com.market.api.model.core.Order;
import com.market.api.model.core.Person;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_client")
public class Client extends Person {

	@OneToMany(fetch = FetchType.LAZY, 
			cascade = {
			CascadeType.REMOVE, 
			CascadeType.DETACH, 
			CascadeType.REFRESH})
	
	private Map<Integer, Order> orders;
}
