package com.microservices.cargomoduleservice.bean;

public class Cargo {

	private int priceOfDelivery;
	private int priceOfShipping;
	
	
	
	public int getPriceOfDelivery() {
		return priceOfDelivery;
	}



	public void setPriceOfDelivery(int priceOfDelivery) {
		this.priceOfDelivery = priceOfDelivery;
	}



	public int getPriceOfShipping() {
		return priceOfShipping;
	}



	public void setPriceOfShipping(int priceOfShipping) {
		this.priceOfShipping = priceOfShipping;
	}



	public Cargo(int priceOfDelivery, int priceOfShipping) {
		this.priceOfDelivery = priceOfDelivery;
		this.priceOfShipping = priceOfShipping;
	}
}
