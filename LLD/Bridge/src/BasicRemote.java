public class BasicRemote extends Remote{
    BasicRemote(Device device){
        super(device);
    }
    @Override
    public void power() {
        device.turnOn();
    }
}
