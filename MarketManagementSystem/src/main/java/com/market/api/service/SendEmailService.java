package com.market.api.service;

import java.util.Set;

import lombok.Data;

public interface SendEmailService {

	void sendEmail();
	
	@Data
	class Message {
		
		private Set<String> recievers;
		
		private String tittle;
		
		private String body;
	}
}
