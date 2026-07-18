public interface Observable {
    void addObserver(NotificationObserver notificationObserver);
    void removeObserver(NotificationObserver notificationObserver);
    void notifyObservers();
}
