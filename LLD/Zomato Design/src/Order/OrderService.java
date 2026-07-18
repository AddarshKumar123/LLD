package Order;

import Factory.OrderFactory;
import Model.MenuItem;
import Model.Restaurant;
import Model.User;
import Payment.PaymentService;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class OrderService {
    public static int nextOrderId=0;
    int id;
    Restaurant restaurant;
    List<MenuItem> menu=new ArrayList<>();
    User user;
    PaymentService paymentService;
    double total;
    String scheduled;
    public abstract String getType();

    OrderService(){
        this.user=null;
        restaurant=null;
        paymentService=null;
        total=0.0;
        scheduled="";
        id=++nextOrderId;
    }

    public boolean processPayment(){
        if(paymentService!=null){
            paymentService.pay(total);
            return true;
        }else{
            System.out.println("please choose a payment mode first");
            return false;
        }
    }

    public int getId(){
        return this.id;
    }

    public void setUser(User user){
        this.user=user;
    }

    public User getUser(){
        return this.user;
    }

    public void setRestaurant(Restaurant restaurant){
        this.restaurant=restaurant;
    }

    public Restaurant getRestaurant(){
        return this.restaurant;
    }

    public void setMenu(List<MenuItem> menu){
        double total=0;
        for(MenuItem menuItem:menu){
            total+=menuItem.getPrice();
        }
    }

    public List<MenuItem> getMenu(){
        return menu;
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void setTotal(double total){
        this.total=total;
    }

    public double getTotal(){
        return this.total;
    }
}
