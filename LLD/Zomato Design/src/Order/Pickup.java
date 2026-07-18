package Order;

public class Pickup extends OrderService {
    String restaurantAddress;

    Pickup(){
        this.restaurantAddress="";
    }
    @Override
    public String getType(){
        return "Pickup";
    }

    public void setRestaurantAddress(String restaurantAddress){
        this.restaurantAddress=restaurantAddress;
    }

    public String getRestaurantAddress(){
        return this.restaurantAddress;
    }
}
