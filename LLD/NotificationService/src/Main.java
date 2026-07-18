public class Main {
    public static void main(String[] args) {
        NotificationObservable notificationObservable=new NotificationObservable();

        Logger logger=new Logger();
        notificationObservable.addObserver(logger);

        Notification notification=new SimpleNotification("This is a notification");
        notification = new TimestampDecorator(notification);
        notification = new SignatureDecorator(notification,"signed");

        notificationObservable.setNotification(notification);
    }
}