public class SignatureDecorator extends NotificationDecorator{
    private String sign;
    SignatureDecorator(Notification notification,String sign) {
        super(notification);
        this.sign=sign;
    }

    @Override
    public String getContent(){
        return notification.getContent()+" "+sign;
    }
}
