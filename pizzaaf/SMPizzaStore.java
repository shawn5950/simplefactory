package com.j2.factory.pizzaaf;

public class SMPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory=new SMPizzaIngredientFactory();
        if (item.equals("potato")) {
            pizza = new PotatoPizza(ingredientFactory);
            pizza.setName("SM Style Potato Pizza");
        }
        return pizza;
    }
}