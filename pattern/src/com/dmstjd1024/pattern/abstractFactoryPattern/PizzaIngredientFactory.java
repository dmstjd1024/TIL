package com.dmstjd1024.pattern.abstractFactoryPattern;

public interface PizzaIngredientFactory {

	public void createDough();

	public void createSauce();
	
	public void createCheese();	
	
	public void createVeggies();
	
	public void createPepperoni();
	
	public void createClam();
}
