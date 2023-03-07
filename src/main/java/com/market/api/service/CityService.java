package com.market.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.market.api.model.City;
import com.market.api.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepo;
	
	public List<City> getAllCities(){
		List<City> cities = new ArrayList<>();
		cities = cityRepo.findAll();
		return cities;
		
	}
}
