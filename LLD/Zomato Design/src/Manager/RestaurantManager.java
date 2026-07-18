package Manager;

import Model.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    List<Restaurant> restaurants=new ArrayList<>();

    public void addRestaurant(Restaurant restaurant){
        restaurants.add(restaurant);
    }

    public List<Restaurant> searchRestaurant(){
        return restaurants;
    }
    private RestaurantManager(){};

    public static class helper{
        private static final RestaurantManager INSTANCE=new RestaurantManager();
    }

    public static RestaurantManager getInstance(){
        return helper.INSTANCE;
    }
}
