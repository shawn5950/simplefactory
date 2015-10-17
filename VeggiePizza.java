package com.j2.factory;

public class VeggiePizza extends Pizza{
  public VeggiePizza(){
    name = "Veggie Pizza";
    dough = "Regular Crust";
    sauce = "Marinara Pizza Sauce";
    toppings.add("Olives");
    toppings.add("Tomatoes");
    toppings.add("Bell Peppers");
    toppings.add("Vegetables");
    toppings.add("Fresh Mozzarella");
  }
}