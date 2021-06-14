package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Planete;
import com.example.demo.repo.PlaneteRepo;




@Service
public class PlaneteService {

	@Autowired
	private PlaneteRepo planeteRepo;
    public List<Planete> getAll() {
        return (List<Planete>) planeteRepo.findAll();
    }
	
}
