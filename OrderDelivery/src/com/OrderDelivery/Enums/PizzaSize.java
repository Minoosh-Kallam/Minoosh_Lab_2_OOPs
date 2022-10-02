package com.OrderDelivery.Enums;

public enum PizzaSize {

	 Large(3) , Medium(2) , Small(1) ;
	 
	 public final int multiplier ;
	
	PizzaSize(int multiplier){
		this.multiplier = multiplier ;
	}
}
