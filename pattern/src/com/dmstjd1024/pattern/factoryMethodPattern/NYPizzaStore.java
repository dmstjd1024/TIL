package com.dmstjd1024.pattern.factoryMethodPattern;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")) {
			return new NYStyleCheesePizza();
		}else if(item.equals("veggie")){
			return null;
//		return new NYStyleVeggiePizza();
		}else if(item.equals("clam")) {
			return null;
//		return new NYStyleClamPizza();
		}else if(item.equals("pepperoni")) {
			return null;
//		return new NYStylePepperoniPizza();
		}else return null;
	}

}
