import java.util.Scanner;
public class UserClient{

    public static void main(String args[]){
        
        
        String name;
        String description;
        double price;
        
        Scanner in = new Scanner(System.in);
       
        System.out.println("Shopping Center ");
        System.out.println("Please sellect Number(Like 1M or 3F) ");
        System.out.println("1M. Nokia phone ");
        System.out.println("2M. Apple Phone ");
        System.out.println("3F. Check Shirt");
        System.out.println("4F. Vans Shoe");

        System.out.print("Which model u want: ");
        String identity = in.next();
        
        Mobile mobileUser = null;
        FashionCloth clothuser = null;
        Cart cart = null;

        if(identity.equalsIgnoreCase("1M")){
            name = "Nokia";
            description = "Good Battery";
            price = 15500;
        
        mobileUser = new Mobile(identity , name , description , price);
        }
        else if(identity.equalsIgnoreCase("2M")){
        name="Apple"; 
        description = "Best Security";
        price = 50000;
    
        mobileUser = new Mobile(identity , name , description , price);
        }
        else if(identity.equalsIgnoreCase("3F")){
            name="Check Shirt"; 
            description = "Best look";
            price = 1500;
        
            clothuser = new FashionCloth(identity , name , description , price);
        }
        else if(identity.equalsIgnoreCase("4F")){
            name="Vans Shoe"; 
            description = "Top Quality";
            price = 5000;
        
            clothuser = new FashionCloth(identity , name ,description , price);
        }


        if(identity.equalsIgnoreCase("1M" ) || identity.equalsIgnoreCase("2M")){
            identity = mobileUser.SetID();
            name = mobileUser.SetName();
            description = mobileUser.SetDescription();
            price = mobileUser.SetPrice();
       
            System.out.print("Which seller you want Indigo or Bluedart: ");
            String newSeller = in.next();
            if(newSeller.equalsIgnoreCase("Indigo")){
                Seller seller1 = new Indigo(identity , name , "Bangalore" , "9844849489");
                seller1.FullFillOrder();
       
            }

            else if(newSeller.equalsIgnoreCase("BlueDart")){ 
                Seller seller2 = new BlueDart(identity , name , "Bangalore" , "9844849489");
                seller2.FullFillOrder();
            }
            cart = new Cart(identity , name , description , price);
            System.out.print("Do you want to add in Cart?(Yes or no)");

            String x = in.next();
            if( x.equalsIgnoreCase("Yes"))
            {
            cart.add();
            }
            else{
            cart.remove();
            }    
        }
       
        else if(identity.equalsIgnoreCase("3F" ) || identity.equalsIgnoreCase("4F")){
            identity = clothuser.SetID();
            name = clothuser.SetName();
            description = clothuser.SetDescription();
            price = clothuser.SetPrice();
       
            System.out.print("Which seller you want Indigo or Bluedart: ");
            String newSeller = in.next();
            if(newSeller.equalsIgnoreCase("Indigo")){
                Seller seller1 = new Indigo(identity , name, "Bangalore" , "9844849489");
                seller1.FullFillOrder();
            }

            else if(newSeller.equalsIgnoreCase("BlueDart")){ 
                Seller seller2 = new BlueDart(identity , name , "Bangalore" , "9844849489");
                seller2.FullFillOrder();
            }
            cart = new Cart(identity , name , description , price);
            System.out.print("Do you want to add in Cart?(Yes or no)");

            String x = in.next();
            if( x.equalsIgnoreCase("Yes")){
                cart.add();
            }
            else{
                cart.remove();
            }
       }
       
       
       Payment payment = null;
       System.out.println( " ");
       System.out.println( " ");

       System.out.print("Choose any payment gateway (Debit,Credit or Netbanking): ");
       String pay = in.next();
       if(pay.equalsIgnoreCase("Debit")){
           payment = new Debit(identity,pay);
           payment.Service();
       }
       else if(pay.equalsIgnoreCase("Credit")){
           payment = new Credit(identity,pay);
           payment.Service();
       }
        else if(pay.equalsIgnoreCase("Netbanking")){
            payment = new Netbanking(identity,pay);
            payment.Service();

       }
       else{
           System.out.println("Wrong payment");
        }
        in.close();


    }
}
