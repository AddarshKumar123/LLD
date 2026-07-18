package RegularClasses;

import Model.MenuItem;
import Model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    Restaurant restaurant;
    List<MenuItem> menu=new ArrayList<>();

    public void addToCart(MenuItem item){
        if(restaurant==null){
            System.out.println("please set a restaurant before adding item");
        }
        menu.add(item);
    }

    public double getTotalCost(){
        double sum=0;
        for (MenuItem item : menu) {
            sum+=item.getPrice();
        }
        return sum;
    }

    public void clear() {
        menu.clear();
        restaurant = null;
    }

    public boolean isEmpty(){
        return menu.isEmpty();
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public Restaurant getRestaurant(){
        return restaurant;
    }

    public List<MenuItem> getMenu(){
        return menu;
    }
}
