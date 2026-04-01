public class Main {
    public static void main(String[] args) {
        VehicleFactory factory=new CarFactory();
        vehicle vehicle=factory.createVehicle();
        vehicle.drive();
    }
}