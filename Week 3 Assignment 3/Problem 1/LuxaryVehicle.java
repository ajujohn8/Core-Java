public class LuxaryVehicle extends Vehicle implements Passanger{

    public LuxaryVehicle(int registrationNumber, String make, String model, String color){
        super(registrationNumber, make, model, color);
    }
    public void setLuxaryVehicle(){
        System.out.println("Registration Number: " +GetRegistrationNumber());
        System.out.println("Make: " +GetMake());
        System.out.println("Model: " +GetModel());
        System.out.println("Color: " +GetColor());
    }
    
    public void NoOfPassanger(){
        System.out.println("Luxury vehicles can only carry two people");
    }
}