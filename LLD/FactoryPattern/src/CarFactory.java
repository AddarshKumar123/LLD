public class CarFactory extends VehicleFactory{
    @Override
    public vehicle createVehicle() {
        return new Car();
    }
}
