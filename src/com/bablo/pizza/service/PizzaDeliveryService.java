/**
 * 
 */
package com.bablo.pizza.service;

import com.bablo.pizza.model.Pizza;

/**
 * @author anushil.s
 *
 */
public interface PizzaDeliveryService {

	Pizza[] devlierOrder();

	void takeOrder(int pizzaQuantity);

}
