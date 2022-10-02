package com.OrderDelivery.Enums;

public enum PizzaToppings {

	Cheese(1.0) , Mushroom(1.0) , Tomato(1.0) , Jalapeno(1.0) ,Spinach(1.0) ;
	
	public final double price ;
	
	private PizzaToppings(double price) {
		this.price = price ;
	}
}
