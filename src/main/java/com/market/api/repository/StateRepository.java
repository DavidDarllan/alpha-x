package com.market.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.market.api.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Long>{

}
