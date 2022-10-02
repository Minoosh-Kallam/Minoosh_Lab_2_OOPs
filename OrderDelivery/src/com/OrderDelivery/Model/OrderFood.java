package com.OrderDelivery.Model;

import com.OrderDelivery.Items.FoodItem;

public class OrderFood {

	private FoodItem foodItem;
	private User user;

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public OrderFood(FoodItem foodItem, User user) {
		super();
		this.foodItem = foodItem;
		this.user = user;
	}

	public OrderFood() {
		super();
	}

}
