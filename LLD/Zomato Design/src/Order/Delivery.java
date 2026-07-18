package Order;

public class Delivery extends OrderService {
    String userAddress;

    public Delivery(){
        userAddress="";
    }
    @Override
    public String getType(){
        return "Delivery";
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserAddress(){
        return this.userAddress;
    }
}
