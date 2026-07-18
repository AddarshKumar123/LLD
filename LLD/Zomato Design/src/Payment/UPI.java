package Payment;

public class UPI implements PaymentService {
    @Override
    public void pay(double total) {
        System.out.println("Payment done using Payment.UPI");
    }
}
