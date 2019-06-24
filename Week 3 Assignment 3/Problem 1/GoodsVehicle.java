public class GoodsVehicle extends Vehicle implements Goods{
   

    public GoodsVehicle(int registrationNumber, String make, String model, String color){
        super(registrationNumber ,make,model,color);
        
    }

    public void setgoodsVehicle(){
        System.out.println("Registration Number: " +GetRegistrationNumber());
        System.out.println("Make: " +GetMake());
        System.out.println("Model: " +GetModel());
        System.out.println("Color: " +GetColor());
    }
   

    public void OnlyGoods(){
        System.out.println("Goods vehicle can carry only goods");
    }
    

}