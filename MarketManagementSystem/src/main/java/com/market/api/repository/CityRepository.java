package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.api.model.core.City;


public interface CityRepository extends JpaRepository<City, Long>{

}
