import java.time.LocalDateTime;

public class TimestampDecorator extends NotificationDecorator{
    public TimestampDecorator(Notification notification) {
        super(notification);
    }

    @Override
    public String getContent(){
        return notification.getContent()+" "+ LocalDateTime.now();
    }
}
