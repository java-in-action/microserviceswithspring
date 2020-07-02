package com.microservices.portsmoduleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.portsmoduleservice.client.ScheduleModuleServiceClient;
import com.microservices.portsmoduleservice.dto.PortDTO;

@RestController
@RequestMapping("/port")
public class PortController {
	
	@Autowired
	private ScheduleModuleServiceClient scheduleModuleServiceClient;

	@GetMapping()
	public PortDTO getPortDetails() {
		return scheduleModuleServiceClient.getPortInformation(10001);
	}
}
