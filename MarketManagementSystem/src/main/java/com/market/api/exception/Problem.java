package com.market.api.exception;

import java.time.OffsetDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Problem {

	private int statusCode;
	
	private OffsetDateTime timestamp;
	
	private String message;
	
	private String description;
}
