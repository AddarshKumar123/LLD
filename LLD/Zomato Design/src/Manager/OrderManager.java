package Manager;

import Model.Restaurant;
import Order.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<OrderService>orders=new ArrayList<>();
    public void addOrder(OrderService order){
        orders.add(order);
    }

    private OrderManager(){};

    public static class helper{
        private static final OrderManager INSTANCE=new OrderManager();
    }

    public static OrderManager getInstance(){
        return OrderManager.helper.INSTANCE;
    }

    void listOrder(){
        System.out.println("All Orders");
        for(OrderService order:orders){
            System.out.println(order.getType()+" order for "+order.getUser().getName());
        }
    }
}
