import java.util.ArrayList;
import java.util.List;

public class NotificationObservable implements Observable{
    public Notification notification;
    List<NotificationObserver>observers=new ArrayList<>();
    @Override
    public void addObserver(NotificationObserver notificationObserver) {
        observers.add(notificationObserver);
    }

    @Override
    public void removeObserver(NotificationObserver notificationObserver) {
        observers.remove(notificationObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver notificationObserver : observers){
            notificationObserver.update(this);
        }
    }

    public void setNotification(Notification notification){
        this.notification=notification;
        notifyObservers();
    }
}
