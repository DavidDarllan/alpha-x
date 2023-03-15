package com.market.api.model.core;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Adress implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column
	private String cep;
	
	@Column
	private String name;
	
	@Column
	private String number;
	
	@Column
	private City city;

}
