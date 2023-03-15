package com.market.api.model.Delivery;

import java.util.List;

import com.market.api.model.core.Person;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "tb_deliveryman")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Deliveryman extends Person{
	
	@OneToMany(mappedBy = "deliveryman")
	private List<DeliveryOrder> orders;

}
