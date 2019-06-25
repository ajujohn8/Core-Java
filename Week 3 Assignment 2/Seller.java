public interface Seller{
    public abstract void FullFillOrder();
}

class Indigo extends Address implements Seller{
    
    public Indigo(String id , String name , String address , String phoneNumber){
        super( id , name , address , phoneNumber);
        super.detailAddress();

    }
   
    public  void FullFillOrder(){
        System.out.println("You have choosed one of the best services!!!");
    }


}

class BlueDart extends Address implements Seller{

    public BlueDart(String id , String name , String address , String phoneNumber){
        super( id , name , address , phoneNumber);
        super.detailAddress();
    }
    
    public  void FullFillOrder(){
        System.out.println("You have choosed one of the fastest diivary!!!" );
    }

}