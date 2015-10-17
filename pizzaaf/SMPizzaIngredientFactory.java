package com.j2.factory.pizzaaf;

public class SMPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCheeseCrustDough();
    }
    public Cheese createCheese() {
        return new ItalianCheese();
    }
    public Potato createPotato() {
      return new WedgedPotato();
    }
}