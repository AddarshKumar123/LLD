package Factory;

import Model.MenuItem;
import Model.Restaurant;
import Model.User;
import Order.OrderService;
import Payment.PaymentService;
import RegularClasses.Cart;

import java.util.List;

public interface OrderFactory {
    public OrderService createOrder(User user, Cart cart, Restaurant restaurant, List<MenuItem>menu, PaymentService paymentService, String orderType);
}
