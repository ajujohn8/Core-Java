interface DriveMethod{

    public void SetGearVehicle();
}

public class VehicleDrive{
    private String CarName;
    
    public VehicleDrive(String CarName){
        this.CarName = CarName;
    }


    public void SetCar(){
        System.out.println("Your Car Name Type: " +CarName);
    }
}