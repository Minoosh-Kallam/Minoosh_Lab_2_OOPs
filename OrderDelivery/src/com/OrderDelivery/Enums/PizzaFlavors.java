package com.OrderDelivery.Enums;

public enum PizzaFlavors {

	Vegetarian(20) , NonVeg(25) , Vegan(15);
	
	public final double price ;

	PizzaFlavors(double price) {
		this.price = price ;
	}
}
