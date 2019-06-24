public class MileageVehicle extends VehicleDrive implements DriveMethod{
    private String gearType;
    public MileageVehicle(String CarName, String gearType){
        super(CarName);
        this.gearType = gearType;
    }
    public void SetGearVehicle(){
        System.out.println("GearType: " +gearType);
    }
        
    
}