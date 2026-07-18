import Factory.OrderFactory;
import Manager.OrderManager;
import Manager.RestaurantManager;
import Model.MenuItem;
import Model.Restaurant;
import Model.User;
import Order.OrderService;
import Payment.PaymentService;
import RegularClasses.Cart;

import java.util.List;

public class Zomato {
    Zomato(){
        initializeRestaurant();
    }

    public void initializeRestaurant(){
        Restaurant restaurant1=new Restaurant("Food Court","Ranchi");
        restaurant1.addMenu(new MenuItem(1,"Chole Bhauture",120));
        restaurant1.addMenu(new MenuItem(2,"Noodles",70));

        Restaurant restaurant2=new Restaurant("Vyanjan","Delhi");
        restaurant2.addMenu(new MenuItem(1,"Paneer burget",100));
        restaurant2.addMenu(new MenuItem(2,"Sandwich",120));

        Restaurant restaurant3=new Restaurant("Sandy sandwich","Punjab");
        restaurant3.addMenu(new MenuItem(1,"cheese sandwich",150));
        restaurant3.addMenu(new MenuItem(2,"Paneer sandwich",170));
    }

    public List<Restaurant> restaurants= RestaurantManager.getInstance().searchRestaurant();

    public void selectRestaurant(User user,Restaurant restaurant){
        Cart cart=user.getCart();
        cart.setRestaurant(restaurant);
    }

    public void addToCart(User user,int itemCode){
        Restaurant restaurant=user.getCart().getRestaurant();
        if(restaurant==null){
            System.out.println("Please select a Restaurant first");
            return;
        }

        for(MenuItem item:restaurant.getMenu()){
            if(item.getCode()==itemCode){
                user.getCart().addToCart(item);
                break;
            }
        }
    }

    OrderService checkout(User user, String orderType, PaymentService paymentService, OrderFactory orderFactory){
        if(user.getCart().isEmpty()){
            return null;
        }

        Cart userCart= user.getCart();
        Restaurant userRestaurant=userCart.getRestaurant();
        List<MenuItem>item=userCart.getMenu();
        double totalCost=userCart.getTotalCost();
        OrderService order=orderFactory.createOrder(user,userCart,userRestaurant,item,paymentService,orderType);
        OrderManager.getInstance().addOrder(order);
        return order;
    }

    public void payment(User user,OrderService order){
        boolean isPaymentSuccess=order.processPayment();
        if(isPaymentSuccess){
            System.out.println("Payment successful");
        }
    }

    public void printCart(User user){
        System.out.println(user.getCart().getTotalCost());
    }


}
