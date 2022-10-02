package com.OrderDelivery;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.OrderDelivery.Enums.PastaFlavors;
import com.OrderDelivery.Enums.PastaType;
import com.OrderDelivery.Enums.PizzaCrust;
import com.OrderDelivery.Enums.PizzaFlavors;
import com.OrderDelivery.Enums.PizzaSize;
import com.OrderDelivery.Enums.PizzaToppings;
import com.OrderDelivery.Items.FoodItem;
import com.OrderDelivery.Items.Pasta;
import com.OrderDelivery.Items.Pizza;
import com.OrderDelivery.Model.OrderFood;
import com.OrderDelivery.Model.User;
import com.OrderDelivery.Staff.Chef;

public class OrderDelivery {

	public static void main(String args[]) {
		Chef chef = new Chef() ;
		System.out.println("Welcome to ABC restraunt");
		
		Scanner sc = new Scanner(System.in) ;
		
		int choice ;
		do {
			
			System.out.println("Enter 1 - Order an item , 2 - Process Orders \n press any other key to exit");
			
			choice = sc.nextInt();
			
			if(choice == 1) {
				
				Set<PizzaToppings>  toppings= new HashSet<>() ;
				PizzaSize size ;
				PizzaCrust crust ;
				PizzaFlavors flavor ;
				
				System.out.println("Enter user name");
				sc.nextLine();
				String name = sc.nextLine();
				User user = new User(name) ;
				int orderChoice ; 
				System.out.println("Enter 1 - Order Pizza , 2 - Order Pasta") ;
				orderChoice = sc.nextInt();
				if(orderChoice == 1) {
					System.out.println("Enter 1 - Veg , 2 - Non Veg , 3 - Vegan");
					int type = sc.nextInt() ;
					if(type == 1) {
						flavor = PizzaFlavors.Vegetarian ;
					}
					else if(type == 2) {
						flavor = PizzaFlavors.NonVeg ;
					}
					else {
						flavor = PizzaFlavors.Vegan ;
					}
					
					System.out.println("Enter 1 - Large , 2 - Medium , 3 - Small");
					type = sc.nextInt() ;
					if(type == 1) {
						size = PizzaSize.Large;
					}
					else if(type == 2) {
						size = PizzaSize.Medium ;
					}
					else {
						size = PizzaSize.Small;
					}
					
					System.out.println("Enter 1 - Thin crust , 2 - Thick crust");
					type = sc.nextInt() ;
					if(type == 1) {
						crust = PizzaCrust.Thin;
					}
					else {
						crust = PizzaCrust.Thick;
					}
					while(true) {
						System.out.println("Enter toppings : 1 - Cheese , 2 - Mushrrom , 3 - Tomato , 4 - Jalapeno , 5 - Spinach , -1 - break");
						type = sc.nextInt() ;
						if(type == 1) {
							toppings.add(PizzaToppings.Cheese);
						}
						else if(type == 2) {
							toppings.add(PizzaToppings.Mushroom);
						}
						else if(type == 3) {
							toppings.add(PizzaToppings.Tomato);
						}
						else if(type == 4) {
							toppings.add(PizzaToppings.Jalapeno);
						}
						else if(type == 5) {
							toppings.add(PizzaToppings.Spinach);
						}
						else {
							break ;
						}
					}
					
					chef.addOrder(new OrderFood(new Pizza(new ArrayList<>(toppings) , crust , flavor , size ) , user));
				}
				
				
				
				else if(orderChoice == 2) {
					PastaType pastaType ;
					PastaFlavors pastaFlavor ;
					System.out.println("Enter 1 - Penne Type , 2 - Ditalini Type");
					int type = sc.nextInt();
					
					if(type == 1)
						pastaType = PastaType.Penne ;
					else
						pastaType = PastaType.Ditalini ;
					
					System.out.println("Enter 1 - White Sauce , 2 - Red Sauce");
					 type = sc.nextInt();
					
					if(type == 1)
						pastaFlavor =  PastaFlavors.WhiteSauce;
					else
						pastaFlavor = PastaFlavors.RedSauce ;
					
					chef.addOrder(new OrderFood(new Pasta(pastaFlavor, pastaType) , user));
				}
			}
			
			else if(choice == 2) {
				
				chef.processOrders();
			}
			
			
			
		}while(choice >= 1 && choice < 3) ;
	}
}
