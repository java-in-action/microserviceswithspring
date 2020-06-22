package com.microservices.cargomoduleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.cargomoduleservice.Configuration;
import com.microservices.cargomoduleservice.bean.Cargo;

@RestController
@RequestMapping("/cargo")
public class CargoController {
	
	@Autowired
	private Configuration configuration;

	@GetMapping
	public Cargo getName() {
		return new Cargo(configuration.getPriceOfDelivery(), configuration.getPriceOfShipping());
	}
}
