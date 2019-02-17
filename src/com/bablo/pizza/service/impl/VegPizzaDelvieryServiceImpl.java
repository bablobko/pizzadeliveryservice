/**
 * 
 */
package com.bablo.pizza.service.impl;

import com.bablo.pizza.model.Pizza;
import com.bablo.pizza.service.PizzaDeliveryService;

/**
 * @author anushil.s
 *
 */
public class VegPizzaDelvieryServiceImpl implements PizzaDeliveryService {
	
	private int pizzaQuantity;

	/* (non-Javadoc)
	 * @see com.bablo.pizza.service.PizzaDeliveryService#devlierOrder()
	 */
	@Override
	public Pizza[] devlierOrder() {
		return new Pizza[this.pizzaQuantity];
	}

	/* (non-Javadoc)
	 * @see com.bablo.pizza.service.PizzaDeliveryService#takeOrder(int)
	 */
	@Override
	public void takeOrder(int pizzaQuantity) {
         this.pizzaQuantity = pizzaQuantity;
         try {
        	 Thread.sleep(3000);
         }catch(InterruptedException ie) {
        	 ie.printStackTrace();
         }
         
         this.preparePizza(pizzaQuantity);
	}

	private void preparePizza(int pizzaQuantity) {
		while(pizzaQuantity > 0) {
			System.out.println("1 Pizza got prepared.");
			pizzaQuantity--;
			try {
				Thread.sleep(5000);
			}catch(InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		
		System.out.println("All pizzas got prepared.");
	}

}
