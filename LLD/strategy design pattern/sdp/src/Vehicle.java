import Type.DriveType;

public class Vehicle {
    DriveType driveType;
    Vehicle(DriveType obj){
        this.driveType=obj;
    }

    public void drive(){
        System.out.println(driveType.drive());
    }
}
