package com.microservices.schedulemoduleservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.schedulemoduleservice.beans.Port;
import com.microservices.schedulemoduleservice.dto.PortDTO;
import com.microservices.schedulemoduleservice.persistence.ScheduleDAO;

@RestController
@RequestMapping("schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleDAO scheduleDAO;

	@Autowired
	private Environment environment;
	
	@GetMapping("/{portID}")
	public PortDTO getPortInformation(@PathVariable("portID") final int portID) {
		Optional<Port> port =  scheduleDAO.findById(portID);
		port.get().setNumberOfInstancePort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		PortDTO portDTO = new PortDTO(port.get().getId(), port.get().getName(), port.get().getLocation(), port.get().getNumberOfInstancePort());
		
		return portDTO;
	}
}
