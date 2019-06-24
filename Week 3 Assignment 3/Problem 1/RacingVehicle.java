public class RacingVehicle extends Vehicle implements Passanger{

    public RacingVehicle(int registrationNumber, String make, String model, String color){
        super(registrationNumber, make, model, color);
    }
    public void setRacingVehicle(){
        System.out.println("Registration Number: " +GetRegistrationNumber());
        System.out.println("Make: " +GetMake());
        System.out.println("Model: " +GetModel());
        System.out.println("Color: " +GetColor());
    }
    
    public void NoOfPassmanger(){
        System.out.println("Racing vehicles can carry only one passenger");
    }
}