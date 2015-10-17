package com.j2.factory.pizzafm;

public class ChicagoStyleClamPizza extends Pizza {

 public ChicagoStyleClamPizza() { 
  name = "Chicago Style Sauce and Cheese Pizza";
  dough = "Thick Crust Dough";
  sauce = "Marinara Sauce";
 
  toppings.add("clam");
 }
}