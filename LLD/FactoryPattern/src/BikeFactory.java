public class BikeFactory extends VehicleFactory{

    @Override
    public vehicle createVehicle() {
        return new Bike();
    }
}
