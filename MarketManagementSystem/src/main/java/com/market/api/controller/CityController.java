package com.market.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.market.api.service.CityService;

@RestController
@RequestMapping("/api/cities")
public class CityController {
	
	@Autowired
	private CityService cityServ;
	

}
