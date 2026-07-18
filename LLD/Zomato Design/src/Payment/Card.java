package Payment;

public interface Card extends PaymentService{

    @Override
    public default void pay(double total) {
        System.out.println("Payment done using Card");
    }
}
