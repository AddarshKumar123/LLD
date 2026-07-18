import Pizza.BasePizza;
import Pizza.MargarettaPizza;
import Pizza.VegdelightPizza;
import Toppings.Extracheese;
import Toppings.Mushroom;

public class Main {
    public static void main(String[] args) {

        BasePizza pizza=new Mushroom(new Extracheese(new VegdelightPizza()));
        System.out.println(pizza.cost());
    }
}