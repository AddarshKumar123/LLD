package Model;

import RegularClasses.Cart;

public class User {
    int id;
    String name;
    String address;
    Cart cart;

    public User(int id,String name,String address){
        this.id=id;
        this.name=name;
        this.address=address;
        cart=new Cart();
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

    public Cart getCart(){
        return cart;
    }

}
