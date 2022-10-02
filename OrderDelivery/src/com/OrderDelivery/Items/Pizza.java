package com.OrderDelivery.Items;

import java.util.List;

import com.OrderDelivery.Enums.PizzaCrust;
import com.OrderDelivery.Enums.PizzaFlavors;
import com.OrderDelivery.Enums.PizzaSize;
import com.OrderDelivery.Enums.PizzaToppings;

public class Pizza implements FoodItem{

	private List<PizzaToppings> pizzaToppings;
	private PizzaCrust pizzaCrust;
	private PizzaFlavors pizzaFlavors;
	private PizzaSize pizzaSize;

	public Pizza(List<PizzaToppings> pizzaToppings, PizzaCrust pizzaCrust, PizzaFlavors pizzaFlavors,
			PizzaSize pizzaSize) {
		super();
		this.pizzaToppings = pizzaToppings;
		this.pizzaCrust = pizzaCrust;
		this.pizzaFlavors = pizzaFlavors;
		this.pizzaSize = pizzaSize;
	}


	public List<PizzaToppings> getPizzaToppings() {
		return pizzaToppings;
	}

	public void setPizzaToppings(List<PizzaToppings> pizzaToppings) {
		this.pizzaToppings = pizzaToppings;
	}

	public PizzaCrust getPizzaCrust() {
		return pizzaCrust;
	}

	public void setPizzaCrust(PizzaCrust pizzaCrust) {
		this.pizzaCrust = pizzaCrust;
	}

	public PizzaFlavors getPizzaFlavors() {
		return pizzaFlavors;
	}

	public void setPizzaFlavors(PizzaFlavors pizzaFlavors) {
		this.pizzaFlavors = pizzaFlavors;
	}

	public PizzaSize getPizzaSize() {
		return pizzaSize;
	}

	public void setPizzaSize(PizzaSize pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	@Override
	public double calculateTotalPrice() {
		double price = this.pizzaFlavors.price * this.pizzaSize.multiplier ;
		for(PizzaToppings topping : pizzaToppings) {
			price += topping.price ;
		}
		return price;
	}


	@Override
	public String toString() {
		return "Pizza [pizzaToppings=" + pizzaToppings + ", pizzaCrust=" + pizzaCrust + ", pizzaFlavors=" + pizzaFlavors
				+ ", pizzaSize=" + pizzaSize + "]";
	}
	
	

}
