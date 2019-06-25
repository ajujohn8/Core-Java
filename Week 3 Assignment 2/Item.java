public class Item{
    private String id;
    private String name;
    private String description;
    private double price;

    public Item(String id , String name , String description , double price){
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    
    public String SetID(){
        return id;
    }
    public String SetName(){
        return name;
    }
    
    public String SetDescription(){
        return description;
    }
    
    public double SetPrice(){
        return price;
    }
}