package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.market.api.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
