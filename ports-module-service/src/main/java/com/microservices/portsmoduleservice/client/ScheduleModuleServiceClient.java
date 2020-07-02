package com.microservices.portsmoduleservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.portsmoduleservice.dto.PortDTO;

@FeignClient(name = "schedule-module-service", url = "localhost:8585")
public interface ScheduleModuleServiceClient {

	@GetMapping("/schedule/{portID}")
	public PortDTO getPortInformation(@PathVariable("portID") final int portID);
}
