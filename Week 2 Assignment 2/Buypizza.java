import java.util.Scanner;
public class Buypizza{

    public static int crustInPizza( String crustPizza , int price ){
        String crust = crustPizza;
        
       if(crust.equalsIgnoreCase("ThinCrust")){
            return price = price + 50;
        }
        else if(crustPizza.equalsIgnoreCase("CheeseBurst")){
            return price = price + 65;
        }
        else if(crustPizza.equalsIgnoreCase("ClassicPan")){
            return price = price + 80;
        }
        else{
            return price + 0;
        }
        
    }

    public static int toppingsInPizza( String toppingsPizza , int price ){


        if(toppingsPizza.equalsIgnoreCase("Corn")){
            return price = price + 105;
        }
        else if(toppingsPizza.equalsIgnoreCase("Chicken")){
            return price = price + 200;
        }
        else if(toppingsPizza.equalsIgnoreCase("Paneer")){
            return price = price + 135;
        }
        else if(toppingsPizza.equalsIgnoreCase("Pineapple")){
            return price = price + 125;
        }
        else if(toppingsPizza.equalsIgnoreCase("Pepperoni")){
            return price = price + 175;
        }

        else{
            return price = price + 0;
        }


    }

    public static int sidesInPizza( String sidesPizza , int price ){
        if(sidesPizza.equalsIgnoreCase("Coke")){
            return price = price + 45;
        }
        else if(sidesPizza.equalsIgnoreCase("Fries")){
            return price = price + 85;
        }
        else if(sidesPizza.equalsIgnoreCase("Wedges")){
            return price = price + 110;
        }
        else if(sidesPizza.equalsIgnoreCase("Nachos")){
            return price = price + 150;
        }
        else{
            return price + 0;
        }
    }

    public static int discountInPizza( int discount, int pricepizza ){
        System.out.println("  ");
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
        int priceOfCrust = 0;
        int priceOftoppings = 0;
        int priceOfsides = 0;
        int finalPrizeOfPizza = 0;
        int ans = 0;
        int count = 0;
        System.out.print("how many pizza do you want? : ");
        Scanner input = new Scanner(System.in);

        ans = input.nextInt();
        System.out.println("  ");
        System.out.println("  ");

        do{
            
        
        System.out.println("Please enter type of Pizza Crust from the list(do not use space): ");
        System.out.println("  ");

        System.out.println("1. ThinCrust   ( Rs 50)");
        System.out.println("2. CheeseBurst ( Rs 65)");
        System.out.println("3. ClassicPan  ( Rs 80");
        System.out.println("  ");
        System.out.print("Your choice: ");

        
        String crustRequired = input.next();
        if( crustRequired.equalsIgnoreCase("ThinCrust") || crustRequired.equalsIgnoreCase("CheeseBurst") || crustRequired.equalsIgnoreCase("ClassicPan")){
        priceOfCrust = crustInPizza( crustRequired , priceOfCrust );
        }//checking for same menu input

        
        else if( !crustRequired.equalsIgnoreCase("ThinCrust") || !crustRequired.equalsIgnoreCase("CheeseBurst") || !crustRequired.equalsIgnoreCase("ClassicPan")){

            System.out.print("Your input is not matching with our menu. Please try one more time: ");
            crustRequired = input.next();
            {
            if( crustRequired.equalsIgnoreCase("ThinCrust") || crustRequired.equalsIgnoreCase("CheeseBurst") || crustRequired.equalsIgnoreCase("ClassicPan")){
            
            priceOfCrust = crustInPizza( crustRequired , priceOfCrust );
            }
        }//trying for reinput
        }//checking with menu with user data
        
        else{
            System.out.print(" Sorry, Your type of crust is not available. So toppings choice will be skipped  ");
           
        }
        

        System.out.println("  ");
        System.out.println("  ");
        if( crustRequired.equalsIgnoreCase("ThinCrust") || crustRequired.equalsIgnoreCase("CheeseBurst") || crustRequired.equalsIgnoreCase("ClassicPan")){

        System.out.println("Please enter type of Pizza toppings required from the list: ");
        System.out.println("  ");

        System.out.println("1. Corn      ( Rs 105)");
        System.out.println("2. Chicken   ( Rs 200)");
        System.out.println("3. Paneer    ( Rs 135)");
        System.out.println("4. Pineapple ( Rs 125)");
        System.out.println("5. Pepperoni ( Rs 175)");
        System.out.println("  ");
        System.out.print("Your choice: ");
        
        String toppingsRequired = input.next();
        if( toppingsRequired.equalsIgnoreCase("Corn") || toppingsRequired.equalsIgnoreCase("Chicken") || toppingsRequired.equalsIgnoreCase("Paneer") || toppingsRequired.equalsIgnoreCase("Pineapple") || toppingsRequired.equalsIgnoreCase("Pepperoni")){
        priceOftoppings = toppingsInPizza( toppingsRequired , priceOftoppings );
        }//checking for same menu input

        else if( !toppingsRequired.equalsIgnoreCase("Corn") || !toppingsRequired.equalsIgnoreCase("Chicken") || !toppingsRequired.equalsIgnoreCase("Paneer") || !toppingsRequired.equalsIgnoreCase("Pineapple") || !toppingsRequired.equalsIgnoreCase("Pepperoni")){
        System.out.print("Your input is not matching with our menu. Please try one more time: ");
        toppingsRequired = input.next();
        {
        if( toppingsRequired.equalsIgnoreCase("Corn") || toppingsRequired.equalsIgnoreCase("Chicken") || toppingsRequired.equalsIgnoreCase("Paneer") || toppingsRequired.equalsIgnoreCase("Pineapple") || toppingsRequired.equalsIgnoreCase("Pepperoni")){
        priceOftoppings = toppingsInPizza( toppingsRequired , priceOftoppings );
        }//trying helping user to reinput
        }//trying helping user to reinput
        }//rechecking for if user has input wrong data
        else{
            System.out.print(" Sorry, Your type of toppings is not available.");

        }
    }//Check for crust is available then move to topping


    
        System.out.println("  ");
        System.out.println("  ");

        System.out.print("Please enter type of Pizza sides required: ");
        System.out.println("  ");

        System.out.println("1. Coke   ( Rs 45)");
        System.out.println("2. Fries  ( Rs 85)");
        System.out.println("3. Wedges ( Rs 110)");
        System.out.println("4. Nachos ( Rs 150)");
        System.out.println("  ");
        System.out.print("Your choice: ");

        String sidesRequired = input.next();
        if( sidesRequired.equalsIgnoreCase("Coke") || sidesRequired.equalsIgnoreCase("Fries") || sidesRequired.equalsIgnoreCase("Wedges") || sidesRequired.equalsIgnoreCase("Nachos")){

        priceOfsides = sidesInPizza( sidesRequired , priceOfsides );
        }//checking menu

        else if( !sidesRequired.equalsIgnoreCase("Coke") || !sidesRequired.equalsIgnoreCase("Fries") || !sidesRequired.equalsIgnoreCase("Wedges") || !sidesRequired.equalsIgnoreCase("Nachos")){
            System.out.print("Your input is not matching with our menu. Please try one more time: ");
            sidesRequired = input.next();
            {
                if( sidesRequired.equalsIgnoreCase("Coke") || sidesRequired.equalsIgnoreCase("Fries") || sidesRequired.equalsIgnoreCase("Wedges") || sidesRequired.equalsIgnoreCase("Nachos")){

                priceOfsides = sidesInPizza( sidesRequired , priceOfsides );

                }
            }//giving one more chance
        }//rechecking same menu input by useer
        else{
            System.out.print(" Sorry, Your type of Sides is not available.");

        }
        


        count++;
        System.out.println("  ");
        System.out.println("  ");

    }while(count < ans );
        int priceOfPizza = 0;
        priceOfPizza = priceOfCrust + priceOftoppings + priceOfsides;
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("Before Discount price: Rs " +priceOfPizza);
        System.out.println("  ");
        System.out.println("  ");

    
        System.out.print("Please select discount offer 20 percent or 50 percent: ");
        int discountPizza = input.nextInt();
        if(discountPizza == 20 || discountPizza == 50){
        finalPrizeOfPizza = discountInPizza( discountPizza , priceOfPizza );
        }
        else
        {
            System.out.print("Sorry.. No discount available in this percent. No discount applied ");
            finalPrizeOfPizza = priceOfPizza;
        }
        
        input.close();

       
        
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.println("  ");
        System.out.print("Your total bill amount is: Rs " +finalPrizeOfPizza);
        System.out.println("  ");
        System.out.println("  ");


        System.out.print("Your Waiting Code is: " +priceOfCrust +priceOftoppings +priceOfsides);
        System.out.println("  ");
        System.out.println("  ");

        System.out.println("Enjoy The Pizza....Thank You  ");




    }
}