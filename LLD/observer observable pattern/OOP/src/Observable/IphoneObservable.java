package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;

public class IphoneObservable implements StockObservable {
    public ArrayList<NotificationObserver> observerList=new ArrayList<>();
    int stockCount=0;
    @Override
    public void add(NotificationObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserver observer:observerList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
            stockCount=stockCount+newStockCount;
            notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
