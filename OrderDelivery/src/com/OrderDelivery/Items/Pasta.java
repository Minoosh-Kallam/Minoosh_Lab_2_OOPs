package com.OrderDelivery.Items;

import com.OrderDelivery.Enums.PastaFlavors;
import com.OrderDelivery.Enums.PastaType;

public class Pasta implements FoodItem{

	private PastaFlavors pastaFlavor;
	private PastaType pastaType;

	public Pasta(PastaFlavors pastaFlavor, PastaType pastaType) {
		super();
		this.pastaFlavor = pastaFlavor;
		this.pastaType = pastaType;
	}

	public PastaFlavors getPastaFlavor() {
		return pastaFlavor;
	}

	public void setPastaFlavor(PastaFlavors pastaFlavor) {
		this.pastaFlavor = pastaFlavor;
	}

	public PastaType getPastaType() {
		return pastaType;
	}

	public void setPastaType(PastaType pastaType) {
		this.pastaType = pastaType;
	}

	@Override
	public double calculateTotalPrice() {
		double price = 0 ;
		price += pastaFlavor.price ;
		return price;
	}

	@Override
	public String toString() {
		return "Pasta [pastaFlavor=" + pastaFlavor + ", pastaType=" + pastaType + "]";
	}
	
	

}
