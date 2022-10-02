package com.OrderDelivery.Enums;

public enum PastaFlavors {

	WhiteSauce(10.0) , RedSauce(20.0) ;
	
	public final double price ;
	
	private PastaFlavors(double price) {
		this.price = price ;
	}
}
