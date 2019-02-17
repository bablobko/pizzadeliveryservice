package com.bablo.pizza.main;

import java.util.Scanner;

import com.bablo.pizza.model.Pizza;
import com.bablo.pizza.model.PizzaTypes;
import com.bablo.pizza.service.PizzaDeliveryService;
import com.bablo.pizza.service.impl.NonVegPizzaDelvieryServiceImpl;
import com.bablo.pizza.service.impl.VegPizzaDelvieryServiceImpl;

/**
 * 
 */

/**
 * @author anushil.s
 *
 */
public class PizzaMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("So you want to have Pizza, let me know which one.");
		Scanner scan = new Scanner(System.in);
		String pizzaTypeString = scan.next();
		if (pizzaTypeString.equalsIgnoreCase(PizzaTypes.VEG.toString())) {
			System.out.println("The customer wants a veg pizza.");
			System.out.println("So how many Veg Pizzas you would like to have!!");
			int pizzaQuantity = scan.nextInt();
			System.out.println(
					"We reieved the order for " + pizzaQuantity + " successfully. We will be delivering it shortly.");

			PizzaDeliveryService pizzaDeliveryService = new VegPizzaDelvieryServiceImpl();
			pizzaDeliveryService.takeOrder(pizzaQuantity);
			Pizza[] pizzaArray = pizzaDeliveryService.devlierOrder();
			if (pizzaArray.length == pizzaQuantity) {
				System.out.println("We recieved the order for " + pizzaQuantity + " sucessfully.");
				System.out.println("Thanks a lot!!");
			}
		} else {
			System.out.println("The customer wants a Non veg pizza.");
			System.out.println("So how many Veg Pizzas you would like to have!!");
			int pizzaQuantity = scan.nextInt();
			System.out.println(
					"We reieved the order for " + pizzaQuantity + " successfully. We will be delivering it shortly.");

			PizzaDeliveryService pizzaDeliveryService = new NonVegPizzaDelvieryServiceImpl();
			pizzaDeliveryService.takeOrder(pizzaQuantity);
			Pizza[] pizzaArray = pizzaDeliveryService.devlierOrder();
			if (pizzaArray.length == pizzaQuantity) {
				System.out.println("We recieved the order for " + pizzaQuantity + " sucessfully.");
				System.out.println("Thanks a lot!!");
			}

		}

		scan.close();
	}
}
