package com.microservices.schedulemoduleservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.schedulemoduleservice.beans.Port;
import com.microservices.schedulemoduleservice.persistence.ScheduleDAO;

@RestController
@RequestMapping("schedule")
public class ScheduleController {
	
	@Autowired
	private ScheduleDAO scheduleDAO;

	@GetMapping("/{portID}")
	public Optional<Port> getPortInformation(@PathVariable("portID") final int portID) {
		return scheduleDAO.findById(portID);
	}
}
