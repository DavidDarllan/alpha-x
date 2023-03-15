package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.api.model.core.State;


public interface StateRepository extends JpaRepository<State, Long>{

}
