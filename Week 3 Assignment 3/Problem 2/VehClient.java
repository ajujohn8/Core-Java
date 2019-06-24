public class VehClient{
    public static void main(String args[]){
        MileageVehicle user1 = new MileageVehicle("Wagnar", "Auto");
        user1.SetGearVehicle();
        user1.SetCar();
        LuxzVehicle user2 = new LuxzVehicle("BMW", "Manual");
        user2.SetGearVehicle();
        user2.SetCar();
    }
}