public abstract class NotificationDecorator implements Notification {
    public Notification notification;

    NotificationDecorator(Notification notification){
        this.notification=notification;
    }

    @Override
    public String getContent(){
        return notification.getContent();
    }
}
