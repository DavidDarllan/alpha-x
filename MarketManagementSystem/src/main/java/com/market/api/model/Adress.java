package com.market.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {
	
	@Column
	private String cep;
	
	@Column
	private String name;
	
	@Column
	private String number;
	
	@Column
	private City city;

}
