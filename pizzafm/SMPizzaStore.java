package com.j2.factory.pizzafm;

public class SMPizzaStore extends PizzaStore {
 Pizza createPizza(String item) {
  if (item.equals("potato")) {
   return new SMStylePotatoPizza();
  }
  else return null;
 }
}