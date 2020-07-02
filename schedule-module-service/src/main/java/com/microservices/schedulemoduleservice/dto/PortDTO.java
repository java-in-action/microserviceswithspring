package com.microservices.schedulemoduleservice.dto;

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

	public PortDTO(int id, String name, String location, int numberOfInstancePort) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.numberOfInstancePort = numberOfInstancePort;
	}
	
	
}
