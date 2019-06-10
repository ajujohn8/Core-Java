import java.util.*;
public class Citizen{
    public static void main(String args[]){
        System.out.print("Input Age: ");
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        System.out.print("Input Citizenship(INDIAN): ");

        String citizen = input.next();
        String maincitizen = "INDIAN";

        System.out.print("Input has voterID: ");
        boolean hasvoter = input.nextBoolean();
        input.close();
        if( citizen.equalsIgnoreCase(maincitizen)){
            System.out.println("You are Indian");

            if( age > 18 && hasvoter){
                System.out.println("You are eligible to vote ");
            }
            else if( age > 18 && !hasvoter){
                System.out.println("You are not eligible to vote  ");
            }
        }
        else{
            System.out.print("You are not from India ");
        }

    }
}

