import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailObserverimpl;
import Observer.NotificationObserver;
import Observer.PhoneNumberObserverimpl;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();
        NotificationObserver observer1=new EmailObserverimpl("xyz@mail.com",iphoneObservable);
        NotificationObserver observer2=new EmailObserverimpl("abc@mail.com",iphoneObservable);
        NotificationObserver observer3=new PhoneNumberObserverimpl("abc",iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(10);


    }
}
