import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private NotificationObservable observable;
    private static NotificationService instance=null;
    private List<Notification>notifications=new ArrayList<>();

    private NotificationService(){
        observable=new NotificationObservable();
    }

    public static NotificationService getInstance(){
        if(instance==null){
            instance = new NotificationService();
        }
        return instance;
    }

    public NotificationObservable getObservable(){
        return observable;
    }

    public void sendNotifications(Notification notification){
        notifications.add(notification);
        observable.setNotification(notification);
    }
}
