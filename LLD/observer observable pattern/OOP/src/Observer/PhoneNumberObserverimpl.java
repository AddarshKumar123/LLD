package Observer;

import Observable.StockObservable;

public class PhoneNumberObserverimpl implements  NotificationObserver {
    String name;
    StockObservable observable;

    public PhoneNumberObserverimpl(String name,StockObservable observable){
        this.observable=observable;
        this.name=name;
    }
    @Override
    public void update() {
        System.out.println(name + " This product is in stock "+ observable.getStockCount());
    }
}
