package com.OrderDelivery.Staff;

import java.util.LinkedList;
import java.util.Queue;

import com.OrderDelivery.Model.OrderFood;

public class Chef {

	Queue<OrderFood> queue ;
	
	public Chef() {
		queue = new LinkedList<>();
	}
	
	public void addOrder(OrderFood orderFood) {
		queue.add(orderFood);
	}
	
	public void processOrders() {
		while(!queue.isEmpty()) {
			OrderFood order = queue.poll();
			
			String user = order.getUser().getUsername() ;
			
			double price = order.getFoodItem().calculateTotalPrice() ;
			
			System.out.println("Hi "+user +" Your Order : "+order.getFoodItem()+" Please pay USD : "+price+" at the reception and enjoy the food");
		}
	}
}
