public class Logger implements NotificationObserver{
    @Override
    public void update(NotificationObservable notificationObservable) {
        System.out.println(notificationObservable.notification.getContent());
    }
}
