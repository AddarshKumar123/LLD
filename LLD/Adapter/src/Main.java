public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor=new PaymentAdapter(new OldPaymentGateway());
        paymentProcessor.pay(30.0);
    }
}