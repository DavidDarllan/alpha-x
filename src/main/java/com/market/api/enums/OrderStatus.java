package com.market.api.enums;


public enum OrderStatus {
	CREATED("created"),
	CONFIRMED("confirmed"),
	DELIVERED("delivered"),
	CANCELED("canceled");

	private final String description; 
	
	OrderStatus(String descrip) {
		this.description = descrip;
	}
	
	public OrderStatus getStatus() {
		return OrderStatus.valueOf(description);
	}
}
