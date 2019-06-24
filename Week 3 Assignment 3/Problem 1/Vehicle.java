interface Goods{
    public abstract void OnlyGoods();
}


interface Passanger{
    public abstract void NoOfPassanger();
    
}


public abstract class Vehicle{
    private int registrationNumber;
    private String make;
    private String model;
    private String color;
    

    public  Vehicle(int registrationNumber, String make, String model, String color){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public int GetRegistrationNumber(){
        return registrationNumber;
    }

    public String GetMake(){
        return make;
    }
    public String GetModel(){
        return model;
    }
    public String GetColor(){
        return color;
    }
    

}



