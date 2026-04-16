public abstract class Remote {
    protected Device device;

    Remote(Device device){
        this.device=device;
    }

    public abstract void power();
}
