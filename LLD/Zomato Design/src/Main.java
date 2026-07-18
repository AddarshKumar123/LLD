import Factory.OrderFactory;
import Model.Restaurant;
import Model.User;
import Payment.UPI;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zomato zomato=new Zomato();
        User user=new User(1,"Addarsh","Ranchi");
        System.out.println("User "+user.getName());

        List<Restaurant>restaurants=zomato.restaurants;
        zomato.selectRestaurant(user,restaurants.get(0));

        System.out.println("Selected restaurant "+restaurants.get(0));
        zomato.addToCart(user,1);
        zomato.addToCart(user,2);

        zomato.printCart(user);

        zomato.checkout(user, "Delivery", new UPI(),) {
        }
    }
}