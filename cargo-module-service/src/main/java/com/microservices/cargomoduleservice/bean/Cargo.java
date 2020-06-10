package com.microservices.cargomoduleservice.bean;

public class Cargo {

	private String priceOfDelivery;
	private String priceOfShipping;
	
	public String getPriceOfDelivery() {
		return priceOfDelivery;
	}
	public void setPriceOfDelivery(String priceOfDelivery) {
		this.priceOfDelivery = priceOfDelivery;
	}
	public String getPriceOfShipping() {
		return priceOfShipping;
	}
	public void setPriceOfShipping(String priceOfShipping) {
		this.priceOfShipping = priceOfShipping;
	}
	
	public Cargo(String priceOfDelivery, String priceOfShipping) {
		this.priceOfDelivery = priceOfDelivery;
		this.priceOfShipping = priceOfShipping;
	}
}
