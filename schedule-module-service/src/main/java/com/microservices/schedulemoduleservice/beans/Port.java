package com.microservices.schedulemoduleservice.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Port {

	@Id
	private int id;
	
	private String name;
	
	private String location;
	
	private int numberOfInstancePort;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNumberOfInstancePort() {
		return numberOfInstancePort;
	}

	public void setNumberOfInstancePort(int numberOfInstancePort) {
		this.numberOfInstancePort = numberOfInstancePort;
	}

	public Port(int id, String name, String location, int numberOfInstancePort) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfInstancePort = numberOfInstancePort;
	}

	public Port() {
		super();
	}
}
