public class PaymentAdapter implements PaymentProcessor{
    OldPaymentGateway oldPaymentGateway;

    public PaymentAdapter(OldPaymentGateway oldPaymentGateway) {
        this.oldPaymentGateway = oldPaymentGateway;
    }
    @Override
    public void pay(double amount) {
        oldPaymentGateway.makePayment(amount);
    }
}
