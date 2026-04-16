public class AdvancedRemote extends Remote{
    AdvancedRemote(Device device){
        super(device);
    }
    @Override
    public void power(){
        device.turnOn();
        System.out.println("Advanced features on");
    }
}
