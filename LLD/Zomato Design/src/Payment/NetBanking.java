package Payment;

public interface NetBanking extends PaymentService{
    @Override
    public default void pay(double total){
        System.out.println("Payment done using Net Banking");
    }
}
