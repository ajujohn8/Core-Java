public class Cart extends Item{
    private String id;
    private String name;
    private String description;
    private double price;

    public Cart(String id , String name , String description , double price){
        super(id , name , description , price);
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void add(){
        System.out.println("");
        System.out.println("ADDED!!");
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Description:" +description);
        System.out.println("Price" +price);


    }
    public void remove(){
        System.out.println("REMOVED!!");
        id = null;
        name = null;
        description = null;
        price = 0;
        System.out.println("");
        System.out.println("ID: " +id);
        System.out.println("Name: " +name);
        System.out.println("Description:" +description);
        System.out.println("Price" +price);
       

        
    }
    

}