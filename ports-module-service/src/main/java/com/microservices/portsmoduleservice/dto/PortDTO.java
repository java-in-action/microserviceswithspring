package com.microservices.portsmoduleservice.dto;

public class PortDTO {


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
}
