package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Planete;



@Repository
public interface PlaneteRepo extends CrudRepository<Planete, Long> {

}