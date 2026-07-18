package Toppings;

import Pizza.BasePizza;

public class Extracheese extends ToppingDecorator{
    BasePizza pizza;

    public Extracheese(BasePizza pizza){
        this.pizza=pizza;
    }

    public int cost(){
        return pizza.cost()+10;
    }
}
