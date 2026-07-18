public class SimpleNotification implements Notification{
    String text;

    public SimpleNotification(String message){
        this.text=message;
    }

    @Override
    public String getContent() {
        return text;
    }
}
