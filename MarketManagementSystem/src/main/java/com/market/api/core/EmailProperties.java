package com.market.api.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(value = "market.email")
@Data
@Component
public class EmailProperties {

	private String sender;
}
