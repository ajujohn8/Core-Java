public class PassangerVehicle extends Vehicle implements Passanger{

    public PassangerVehicle(int registrationNumber, String make, String model, String color){
        super(registrationNumber, make, model, color);
    }
    public void setpassangerVehicle(){
        System.out.println("Registration Number: " +GetRegistrationNumber());
        System.out.println("Make: " +GetMake());
        System.out.println("Model: " +GetModel());
        System.out.println("Color: " +GetColor());
    }
    
    public void NoOfPassanger(){
        System.out.println("Passenger vehicles can carry more than 4 people");
    }
}