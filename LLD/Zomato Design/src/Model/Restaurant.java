package Model;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private static int restaurantId=0;
    int id;
    String name;
    String address;
    List<MenuItem> menu=new ArrayList<>();

    public Restaurant(String name,String address){
        this.name=name;
        this.address=address;
        this.id=++restaurantId;
    }

    public String getName(){
        return this.name;
    }

    void setName(String name){
        this.name=name;
    }

    public String getAddress(){
        return this.address;
    }

    void setAddress(String address){
        this.address=address;
    }

    public void addMenu(MenuItem menuItem){
        menu.add(menuItem);
    }

    public List<MenuItem> getMenu(){
        return menu;
    }
}
