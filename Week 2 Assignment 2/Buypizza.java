import java.util.Scanner;
public class Buypizza{

    public static int crustInPizza( String crustPizza , int price ){
        String crust = crustPizza;
        
       if(crust.equalsIgnoreCase("ThinCrust")){
            return price = 50;
        }
        else if(crustPizza.equalsIgnoreCase("CheeseBurst")){
            return price = 65;
        }
        else if(crustPizza.equalsIgnoreCase("ClassicPan")){
            return price = 80;
        }
        else{
            return 0;
        }
        
    }

    public static int toppingsInPizza( String toppingsPizza , int price ){


        if(toppingsPizza.equalsIgnoreCase("Corn")){
            return price = 105;
        }
        else if(toppingsPizza.equalsIgnoreCase("Chicken")){
            return price = 200;
        }
        else if(toppingsPizza.equalsIgnoreCase("Paneer")){
            return price = 135;
        }
        else if(toppingsPizza.equalsIgnoreCase("Pineapple")){
            return price = 125;
        }
        else if(toppingsPizza.equalsIgnoreCase("Pepperoni")){
            return price = 175;
        }

        else{
            return price = 0;
        }


    }

    public static int sidesInPizza( String sidesPizza , int price ){
        if(sidesPizza.equalsIgnoreCase("Coke")){
            return price = 45;
        }
        else if(sidesPizza.equalsIgnoreCase("Fries")){
            return price = 85;
        }
        else if(sidesPizza.equalsIgnoreCase("Wedges")){
            return price = 110;
        }
        else if(sidesPizza.equalsIgnoreCase("Nachos")){
            return price = 150;
        }
        else{
            return 0;
        }
    }

    public static int discountInPizza( int discount, int pricepizza ){
        System.out.println("  ");
        System.out.println("Before Discount price: Rs " +pricepizza);
        if(discount==20){
            return ((pricepizza*80)/100);
         }

        else if(discount==50){
            return ((pricepizza*50)/100);
        }
        else{
            return pricepizza;
        }
    }
   



    public static void main(String args[]){
        
        System.out.println("  ");
        System.out.println("Welcome to Pizza delivery center");
        System.out.println("  ");

        System.out.println("Please enter type of Pizza Crust from the list(do not use space): ");
        System.out.println("  ");

        System.out.println("1. ThinCrust( Rs 50)");
        System.out.println("2. CheeseBurst( Rs 65)");
        System.out.println("3. ClassicPan( Rs 80");
        System.out.println("  ");
        System.out.print("Your choice: ");

        int priceOfCrust = 0;
        int priceOftoppings = 0;
        int priceOfsides = 0;
        int finalPrizeOfPizza = 0;

        Scanner input = new Scanner(System.in);
        String crustRequired = input.next();
        priceOfCrust = crustInPizza( crustRequired , priceOfCrust );
       
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Please enter type of Pizza toppings required from the list: ");
        System.out.println("  ");

        System.out.println("1. Corn( Rs 105)");
        System.out.println("2. Chicken( Rs 200)");
        System.out.println("3. Paneer( Rs 135)");
        System.out.println("4. Pineapple( Rs 125)");
        System.out.println("5. Pepperoni( Rs 175)");
        System.out.println("  ");
        System.out.print("Your choice: ");
        
        String toppingsRequired = input.next();
        priceOftoppings = toppingsInPizza( toppingsRequired , priceOftoppings );
        System.out.println("  ");
        System.out.println("  ");

        System.out.print("Please enter type of Pizza sides required: ");
        System.out.println("  ");

        System.out.println("1. Coke( Rs 45)");
        System.out.println("2. Fries( Rs 85)");
        System.out.println("3. Wedges( Rs 110)");
        System.out.println("4. Nachos( Rs 150)");
        System.out.println("  ");
        System.out.print("Your choice: ");

        String sidesRequired = input.next();
        priceOfsides = sidesInPizza( sidesRequired , priceOfsides );

        
        int priceOfPizza = 0;
        priceOfPizza = priceOfCrust + priceOftoppings + priceOfsides;
        System.out.println("  ");
        System.out.println("  ");


    
        System.out.print("Please select discount offer 20 percent or 50 percent: ");
        int discountPizza = input.nextInt();
        finalPrizeOfPizza = discountInPizza( discountPizza , priceOfPizza );
    
        
        System.out.println("  ");
        System.out.print("Your total bill amount is: Rs " +finalPrizeOfPizza);
        System.out.println("  ");
        System.out.println("  ");


        System.out.print("Your Waiting Code is: " +priceOfCrust +priceOftoppings +priceOfsides);
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Enjoy The Pizza....Thank You  ");


        input.close();


    }
}