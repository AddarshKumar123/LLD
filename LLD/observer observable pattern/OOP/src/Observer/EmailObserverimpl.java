package Observer;

import Observable.StockObservable;

public class EmailObserverimpl implements NotificationObserver {
    String email;
    StockObservable observable;

    public EmailObserverimpl(String email,StockObservable observable){
        this.observable=observable;
        this.email=email;
    }
    @Override
    public void update() {
        System.out.println(email + " This product is in stock now" + observable.getStockCount());
    }
}
