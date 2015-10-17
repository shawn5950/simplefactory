package com.j2.factory;

public class PotatoPizza extends Pizza{
  public PotatoPizza(){
    name = "Potato Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Potatoes");
    toppings.add("Bacon");
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
}