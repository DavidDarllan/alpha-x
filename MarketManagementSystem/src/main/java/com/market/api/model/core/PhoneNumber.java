package com.market.api.model.core;

import com.market.api.enums.PhoneType;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Embeddable
@Data
public class PhoneNumber {
	
	@Id
	private Long id;
	
	@Column
	private PhoneNumber phone;
	
	@Enumerated(EnumType.STRING)
	private PhoneType type;
	
	@ManyToOne
	private Person owner;
	
	

}
