package com.BikkadIT.MakeMyTripApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.MakeMyTripApp.model.Passanger;

@Repository
public interface PassangerRepository extends JpaRepository<Passanger, Integer> {

}