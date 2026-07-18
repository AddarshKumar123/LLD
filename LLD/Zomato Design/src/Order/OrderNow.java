package Order;

import Factory.OrderFactory;
import Model.MenuItem;
import Model.Restaurant;
import Model.User;
import Payment.PaymentService;
import RegularClasses.Cart;

import java.util.List;
import java.util.Objects;

public class OrderNow implements OrderFactory {
    @Override
    public void createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem>menu, PaymentService paymentService,String orderType) {
        OrderService orderService=null;
        if(Objects.equals(orderType, "Delivery")){
            Delivery deliveryOrder=new Delivery();
            deliveryOrder.setUserAddress(user.getAddress());
            orderService=deliveryOrder;
        }else{
            Pickup pickup=new Pickup();
            pickup.setRestaurantAddress(restaurant.getAddress());
            orderService=pickup;
        }

        orderService.setUser(user);
        orderService.setRestaurant(restaurant);
        orderService.setMenu(menu);
        orderService.setPaymentService(paymentService);
        orderService.setTotal(cart.getTotalCost());
    }
}
